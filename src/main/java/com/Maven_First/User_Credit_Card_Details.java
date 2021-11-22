package com.Maven_First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Credit_Card_Details {
	
	
	public WebDriver driver;
	
	public User_Credit_Card_Details(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="first_name")
	public WebElement first_name;
	
	@FindBy(xpath="//select[@id='cc_type']")
	public WebElement credit_type;

	@FindBy(id="cc_exp_month")
	public WebElement month;
	
	@FindBy(xpath="//input[@name='book_now']")
	public WebElement book_now;
	
	@FindBy(name="my_itinerary")
	public WebElement liberary; 	
	
	@FindBy(partialLinkText="Logout")
	public WebElement logout;

}
