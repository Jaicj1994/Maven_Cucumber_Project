package com.Demo_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class Demo_Configuration_Reader {
	
	static Properties prop;
	
	public  Demo_Configuration_Reader() throws Throwable {
		
		File file=new File("C:\\Users\\Jaicj\\eclipse-workspace\\Maven_First\\src\\main\\java\\Demo_property\\Demo_property.properties");
		
		FileInputStream fis=new FileInputStream(file);
		
		prop=new Properties();
		
		prop.load(fis);
		
	}
	
	public String getInstanceURL() {
		
		String url=prop.getProperty("Demo_url");
		
		return url;

	}
	
	public String getInstanceUsername()
	{
		String username=prop.getProperty("user_email");
		
		return username;
				
	}
	
	public String getInstancePassword()
	{
		String password=prop.getProperty("user_password");
		
		return password;
	}
	
	
		
	

}
