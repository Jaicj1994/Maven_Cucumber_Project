package com.Maven_First;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test_Runner extends Base_class {

	public static WebDriver driver = Base_class.getBrowser("chrome");

	public static Home_Page login = new Home_Page(driver);

	public static void main(String args[]) throws IOException {

		getURL("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		inputString(login.username, "jaikumar267");
		keyboard_actions();
		inputString(login.password, "Gouthamjai");
		ClickonBtn(login.login_btn);
		adults(login.location, "London", "byVisibleText");
		keyboard_action_room();
		rooms_count();
		start_date();
		adults(login.adult_room, "4", "selectByValue");
		keyboard_action_room();
		ClickonBtn(login.submit);
		ClickonBtn(login.radio);
		ClickonBtn(login.cont_btn);
		inputString(login.first_name, "Jaikumar");
		keyboard_action_room();
		inputvalues("Eswaran");
		keyboard_action_room();
		inputvalues("Chennai");
		keyboard_action_room();
		inputvalues("1234567890123412");
		adults(login.credit_type, "Master Card", "byVisibleText");
		adults(login.month, "March", "byVisibleText");
		keyboard_action_room();
		inputvalues("2021");
		keyboard_action_room();
		inputvalues("299");
		ClickonBtn(login.book_now);
		waits();
		ClickonBtn(login.liberary);
		snapshot();
		teriminate();
	}

}
