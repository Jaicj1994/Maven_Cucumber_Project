package com.Maven_First;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_class {

	public static WebDriver driver;

	public static Actions action;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "Driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		return driver;

	}

	public static void getURL(String url) {
		driver.get(url);

	}

	public static void inputString(WebElement element, String string) {

		element.sendKeys(string);
	}

	public static void ClickonBtn(WebElement Login_btn) {
		Login_btn.click();
	}

	
	public static void loc_dropdwn(WebElement drop_down, String options) {

		Select option = new Select(drop_down);
		option.selectByValue(options);

	}

	public static void keyboard_actions() {

		action=new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.DOWN).build().perform();

	}
	

	public static void keyboard_action_room() {

		action.sendKeys(Keys.TAB).sendKeys(Keys.DOWN).build().perform();

	}

	public static void rooms_count() {
		action.sendKeys(Keys.TAB).sendKeys(Keys.DOWN.DOWN).build().perform();
	}

	public static void start_date() {
		action.sendKeys(Keys.TAB).sendKeys("22/11/2021").perform();
		action.sendKeys(Keys.TAB).sendKeys("23/11/2021").perform();
	}

	public static void adults(WebElement adult_count, String value, String Type) {
		Select options = new Select(adult_count);

		switch (Type) {

		case "byVisibleText":
			options.selectByVisibleText(value);
			break;

		case "bySelectedValue":
			options.selectByValue(value);
			break;

		}

	}

	public static void snapshot() throws IOException {

		TakesScreenshot snap = (TakesScreenshot) driver;
		File src = snap.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Jaicj\\eclipse-workspace\\Maven_First\\Driver\\Booking_img.png");
//		File des_1 = new File("C:\\Users\\Jaicj\\eclipse-workspace\\Maven_First\\Driver\\Bookin_img.png");
		FileHandler.copy(src, des);
//		FileHandler.copy(src, des_1);

	}

	public static void inputvalues(String name) {

		action.sendKeys(name).perform();
	}

	public static void waits() {

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	public static void teriminate() {

		driver.close();
	}

}
