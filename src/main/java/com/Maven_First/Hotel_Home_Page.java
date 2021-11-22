package com.Maven_First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Home_Page {

	public WebDriver driver;

	public Hotel_Home_Page(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//select[@id='location']")
	public WebElement location;

	@FindBy(xpath = "//select[@id='adult_room']")
	public WebElement adult_room;

	@FindBy(xpath = "//input[@id='Submit']")
	public WebElement submit;

	@FindBy(id = "radiobutton_0")
	public WebElement radio;

	@FindBy(xpath = "//input[@name='continue']")
	public WebElement cont_btn;

}
