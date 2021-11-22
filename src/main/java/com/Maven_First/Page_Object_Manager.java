package com.Maven_First;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public WebDriver driver;

	private Home_Page hp;

	private Hotel_Home_Page hhp;

	private User_Credit_Card_Details uccd;

	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
	}

	public Home_Page getInstanceHome_Page() {
		
			if(hp==null)
			{
				hp=new Home_Page(driver);
			}
			return hp;
		}	
	
	public Hotel_Home_Page getHoteHomePage()
	{
		
		if(hhp==null)
		{
			hhp=new Hotel_Home_Page(driver);
		}
		
		return hhp;
		
	}
	
	public User_Credit_Card_Details getUserDetails()
	{
		
		if(uccd==null)
		{
			uccd=new User_Credit_Card_Details(driver);
		}
		
		return uccd;
		
	}
	
		
		
	
//		switch() {
//		
//		case "null":
//		
//					hp=new Home_Page(driver);		
//					
//		}
//		return hp;
		
}
