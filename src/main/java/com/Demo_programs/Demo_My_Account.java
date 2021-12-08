package com.Demo_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_My_Account {
	
	static WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
	public WebElement t_shirts;
	
	@FindBy(xpath="//*[@id=\\\"center_column\\\"]/ul/li/div/div[1]/div/a[1]/img")
	public WebElement img;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
	public WebElement add_2_cart;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	
	
	public WebElement proceed_2_check;
	
	
	
	public Demo_My_Account(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

}
