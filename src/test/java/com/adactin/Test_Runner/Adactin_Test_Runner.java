package com.adactin.Test_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Maven_First.Base_class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/com/adactin/feature/Feature_File.feature",
		glue = "com.adactin.Step_Definition",
		dryRun=false,
			
		plugin = {
						"html:Report/HtmlReport.html","pretty",
						"com.cucumber.listener.ExtentCucumberFormatter:Report/extent.html"
						
//						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						
				},
				
		monochrome = true
		
		
		
				
		)


public class Adactin_Test_Runner {
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void start_Browser()
	{
		driver=Base_class.getBrowser("chrome");
	}
	
	@AfterClass
	public static void tear_Browser()
	{
		
		driver.close();
	}

}
