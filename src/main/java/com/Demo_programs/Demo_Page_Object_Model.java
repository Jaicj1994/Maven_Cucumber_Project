package com.Demo_programs;

import org.openqa.selenium.WebDriver;

import com.Maven_First.Home_Page;
import com.Maven_First.Hotel_Home_Page;
import com.Maven_First.User_Credit_Card_Details;

public class Demo_Page_Object_Model {

	static WebDriver driver;
	static Demo_Home_Page dhp;
	static Demo_My_Account dma;
	static Demo_Shopping_Cart_Sum dscs;

	public Demo_Page_Object_Model(WebDriver driver2) {
		this.driver = driver2;
	}

	public Demo_Home_Page getInstanceHome_Page() {

		if (dhp == null) {
			dhp = new Demo_Home_Page(driver);
		}
		return dhp;
	}

	public Demo_My_Account getMyAccount() {

		if (dma == null) {
			dma = new Demo_My_Account(driver);
		}

		return dma;

	}

	public Demo_Shopping_Cart_Sum getUserDetails() {

		if (dscs == null) {
			dscs = new Demo_Shopping_Cart_Sum(driver);
		}

		return dscs;

	}

}
