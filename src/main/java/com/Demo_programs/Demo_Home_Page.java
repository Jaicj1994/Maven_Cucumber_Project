package com.Demo_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_Home_Page {
	
	static WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	public WebElement sigin;
	
	@FindBy(id="email")
	public WebElement user_email;
	
	@FindBy(id="passwd")
	public WebElement user_password;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
	public WebElement login_button;
		
	
	public  Demo_Home_Page(WebDriver driver2)
	{
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	

}
