package com.Maven_First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public static WebDriver driver;
	
	@FindBy(id="username")
	public WebElement username;
	
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='login']")
	public WebElement login_btn;
	
	@FindBy(xpath="//select[@id='location']")
	public WebElement location;
	
	@FindBy(xpath="//select[@id='adult_room']")
	public WebElement adult_room;
	
	@FindBy(xpath="//input[@id='Submit']")
	public WebElement submit;
	
	@FindBy(id="radiobutton_0")
	public WebElement radio;
	
	@FindBy(xpath="//input[@name='continue']")
	public WebElement cont_btn;
	
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
	
	

//	public WebElement getUsername() {
//		return username;
//	}
//

//	public WebElement getPassword() {
//		return password;
//	}


	public  Home_Page(WebDriver driver_2)
	{
		this.driver=driver_2;
		
		PageFactory.initElements(driver, this);
	}




	}

