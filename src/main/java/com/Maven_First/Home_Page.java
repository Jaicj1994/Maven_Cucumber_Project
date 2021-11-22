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

