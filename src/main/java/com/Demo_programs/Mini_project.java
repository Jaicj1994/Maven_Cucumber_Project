package com.Demo_programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mini_project {

	static Logger log = Logger.getLogger(Mini_project.class);

	public static void main(String args[]) throws AWTException, InterruptedException {

		PropertyConfigurator.configure("log4j.properties");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaicj\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
		log.info("Succesfully launched");

		WebElement sigin = driver.findElement(By.xpath("//a[@class='login']"));
		sigin.click();

		log.info("signin page opend");

		WebElement authendication = driver.findElement(By.id("email"));
		authendication.sendKeys("Jaikumar@gmail.com");

		WebElement pswd = driver.findElement(By.id("passwd"));
		pswd.sendKeys("Gouthamjai");

		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

		log.info("Successfuly logged in");

		Actions actions = new Actions(driver);

		WebElement t_shirts = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		t_shirts.click();

		WebElement image = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		Actions builder = new Actions(driver);
		builder.moveToElement(image).build().perform();

		WebElement addtocart = driver
				.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		addtocart.click();

		log.info("process1 success");

		WebElement proceed1 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		proceed1.click();
		log.info("process2 success");
		Thread.sleep(3000);
		WebElement proceed2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		proceed2.click();

		log.info("process3 success");

		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		log.info("process4 success");

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		log.info("process5 success");

		driver.findElement(By.xpath("//a[@title='Pay by check.']")).click();
		log.info("Payment method");

		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
		log.info("Order confirmed");

//				String parentID=driver.getWindowHandle();
//				Set<String> child_web=driver.getWindowHandles();
//				Thread.sleep(5000);
//				
//				for(String st:child_web)
//				{
//					if(!st.equals(parentID)) {
//					driver.switchTo().window(st);
//					}
//					
//					WebElement dress=driver.findElement(By.xpath("//img[@title='Printed Summer Dress']"));
//					JavascriptExecutor jse=(JavascriptExecutor)driver;
//					jse.executeScript("arguments[0].scrollIntoView(true)",dress);
//					dress.click();
//					Thread.sleep(3000);
//					WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
//					addtocart.click();
//					
//					
//					
//				}

	}
}
