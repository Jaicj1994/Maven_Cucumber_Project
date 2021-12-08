package com.adactin.Step_Definition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.Maven_First.Base_class;
import com.Maven_First.Page_Object_Manager;
import com.adactin.Test_Runner.Adactin_Test_Runner;
import com.property.Configration_Manager;
import com.property.File_Reader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_class {

	public static WebDriver driver; // null

	
	public static Page_Object_Manager pom = new Page_Object_Manager(Adactin_Test_Runner.driver); // invoked
																									// Adactin_Test_Runner
 
	@Given("user launch the Application")
	public void user_launch_the_application() throws Exception {

		String url = Configration_Manager.getInstance_File_Reader().getInstance_Config_Reader().getURL();

		getURL(url);

	}
	
	
	
	@When("user Enter the {string} in Username filed and {string} in Password Field")
	public void user_enter_the_in_username_filed_and_in_password_field(String Username, String Password) {
	   
		inputString(pom.getInstanceHome_Page().username,Username);
		inputString(pom.getInstanceHome_Page().password, Password);
	}



	@Then("click On the Login Button and it will Navigate to Search Hotel Page")
	public void click_on_the_login_button_and_it_will_navigate_to_search_hotel_page() {

		ClickonBtn(pom.getInstanceHome_Page().login_btn);

	}
	


//	@When("select The hotel Location")
//	public void select_the_hotel_location() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}




	@When("select The hotel Location")
	public void select_the_hotel_location() throws Exception {

		String location = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getLocation();

		adults(pom.getHoteHomePage().location, location, "byVisibleText");
		keyboard_actions();
		keyboard_action_room();

			}

	@When("select The Hotel which you want")
	public void select_the_hotel_which_you_want() throws Exception {

		
	}

	@When("select The Room type which you want")
	public void select_the_room_type_which_you_want() {

		rooms_count();
	}

	@When("select Then Number of rooms which you want")
	public void select_then_number_of_rooms_which_you_want() {

	}

	@When("mention The Check in and Check out Date")
	public void mention_the_check_in_and_check_out_date() {
		start_date();
	}

	@When("select The Adults And Children per Room")
	public void select_the_adults_and_children_per_room() throws Exception {
		
		String adults = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getAdults_Room();

		adults(pom.getHoteHomePage().adult_room, adults, "selectByValue");
		
		keyboard_action_room();

	}

	@Then("click On the Search Button it will Navigate to Select Hotel")
	public void click_on_the_search_button_it_will_navigate_to_select_hotel() {
		
		ClickonBtn(pom.getHoteHomePage().submit);

	}

	@When("click On the select filed to select the Hotel")
	public void click_on_the_select_filed_to_select_the_hotel() {
		ClickonBtn(pom.getHoteHomePage().radio);
	}

	@Then("click On the continue Button And it will Navigate to Book Hotel Page")
	public void click_on_the_continue_button_and_it_will_navigate_to_book_hotel_page() {
		ClickonBtn(pom.getHoteHomePage().cont_btn);
	}

	@When("user Enter the First Name And Last Name")
	public void user_enter_the_first_name_and_last_name() throws Exception {
		
		String first_name = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getFirst_name();

		inputString(pom.getUserDetails().first_name, first_name);

		keyboard_action_room();
		inputvalues("Eswaran");
	}

	@When("user Provide the Address details")
	public void user_provide_the_address_details() {
		keyboard_action_room();
		inputvalues("Chennai");
		keyboard_action_room();
	}

	@When("user Provide the Credit Card details And Credit Type And Expiry Date And Year And CVV Number")
	public void user_provide_the_credit_card_details_and_credit_type_and_expiry_date_and_year_and_cvv_number()
			throws Exception {
		
		inputvalues("1234567890123411");
		String credit_type = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getCredit_type();

		adults(pom.getUserDetails().credit_type, credit_type, "byVisibleText");
		
		String month = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getMonth();

		adults(pom.getUserDetails().month, month, "byVisibleText");

		keyboard_action_room();
		inputvalues("2021");
		keyboard_action_room();
		inputvalues("299");
	}

	@Then("click On the Book Now Button it will Navigate to Booking Confimation Page")
	public void click_on_the_book_now_button_it_will_navigate_to_booking_confimation_page() {
		
		ClickonBtn(pom.getUserDetails().book_now);
	}

	@When("user Verify the given details")
	public void user_verify_the_given_details() {
		waits();
		

	}

	@When("click On the My Itinerary Button it will Navigate to Booked Itinerary Page")
	public void click_on_the_my_itinerary_button_it_will_navigate_to_booked_itinerary_page() {
		ClickonBtn(pom.getUserDetails().liberary);
	}

	@When("user Can select the Booked Itinerary Details And user can select the Hotel")
	public void user_can_select_the_booked_itinerary_details_and_user_can_select_the_hotel() {

	}

	@Then("click On the Logout button it will shows like You have successfully logged out.")
	public void click_on_the_logout_button_it_will_shows_like_you_have_successfully_logged_out() throws InterruptedException, IOException {
		
		ClickonBtn(pom.getUserDetails().logout);
		snapshot();
		Thread.sleep(2000);

	}

}
