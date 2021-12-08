package com.Demo_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_Shopping_Cart_Sum {
static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	public WebElement proceed_3_check;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
	public WebElement proceed_4_check; 
	
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement check_box;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
	public WebElement order_added;
		
	@FindBy(xpath="//a[@title='Pay by check.']")
	public WebElement pay_2_check;
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")
	public WebElement order_placed;
	
	
	public  Demo_Shopping_Cart_Sum(WebDriver driver2)
	{
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

}
