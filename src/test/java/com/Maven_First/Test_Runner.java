package com.Maven_First;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.property.File_Reader;
import org.testng.annotations.Test;

public class Test_Runner extends Base_class {

	static WebDriver driver = Base_class.getBrowser("chrome");

	static Page_Object_Manager pom = new Page_Object_Manager(driver);

	static Logger logger = Logger.getLogger(Test_Runner.class);

//	public static void main(String args[]) throws Exception {

	@Test
	private void chrome_Lanuch() throws Exception {

		PropertyConfigurator.configure("log4j.properties");
		String url = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getURL();

		getURL(url);
		logger.info("Initilizing URL Page");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	private void Login_Credentional() throws Exception {

		String username = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getUsername();

		inputString(pom.getInstanceHome_Page().username, username);

		keyboard_actions();

		String password = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getPassword();

		inputString(pom.getInstanceHome_Page().password, password);

		ClickonBtn(pom.getInstanceHome_Page().login_btn);

		logger.info("Successfully logged into the Addactin Site");

	}

	@Test(priority = 3)

	private void home_Page() throws Exception {
		String location = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getLocation();

		adults(pom.getHoteHomePage().location, location, "byVisibleText");

		keyboard_action_room();
		rooms_count();
		start_date();

		String adults = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getAdults_Room();

		adults(pom.getHoteHomePage().adult_room, adults, "selectByValue");

		keyboard_action_room();

		ClickonBtn(pom.getHoteHomePage().submit);

		ClickonBtn(pom.getHoteHomePage().radio);

		ClickonBtn(pom.getHoteHomePage().cont_btn);

		logger.info("Location and details successfully elected by User ");

	}

	@Test(priority = 4)
	private void user_Detatils() throws Exception {
		String first_name = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getFirst_name();

		inputString(pom.getUserDetails().first_name, first_name);

		keyboard_action_room();
		inputvalues("Eswaran");
		keyboard_action_room();
		inputvalues("Chennai");
		keyboard_action_room();
		inputvalues("1234567890123411");

		String credit_type = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getCredit_type();

		adults(pom.getUserDetails().credit_type, credit_type, "byVisibleText");

		String month = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getMonth();

		adults(pom.getUserDetails().month, month, "byVisibleText");

		keyboard_action_room();
		inputvalues("2021");
		keyboard_action_room();
		inputvalues("299");

		ClickonBtn(pom.getUserDetails().book_now);
		logger.info("User details completed successfully");

	}

	@Test(priority = 5)

	private void hotel_Booking() throws IOException {
		waits();
		logger.info("List of Booked Hotels");
		ClickonBtn(pom.getUserDetails().liberary);

		logger.info("Screenshot has been taken");
		snapshot();
	}

	@Test(priority = 6)
	private void log_off() {
		logger.info("Logoff successfully");
		ClickonBtn(pom.getUserDetails().logout);
	}

}
