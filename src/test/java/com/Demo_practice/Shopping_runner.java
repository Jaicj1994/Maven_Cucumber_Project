package com.Demo_practice;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.Demo_programs.Demo_Configuration_Reader;
import com.Demo_programs.Mini_project;
import com.Maven_First.Base_class;
import com.Demo_programs.*;


public class Shopping_runner extends Base_class {
	
	static WebDriver driver =Base_class.getBrowser("chrome");
	


	static Logger log = Logger.getLogger(Mini_project.class);

	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");

		String url=Demo_Config_Manager.getInstanceDemo_Config().getInstanceDemo_Config_Reader().getInstanceURL();
		
		getURL(url);

	}

}
