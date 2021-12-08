package com.TestNG_Features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_A  extends Parameters_B {
	
	@Test (priority=3)
	@Parameters({"username"})
	private void user_Credential(@Optional("Jaikumarcj")String username)
	{
		
		
		System.out.println("This is Afterclass Parameters_A: " +username);
	}
	
	@Test (priority=2)
	@Parameters({"password"})
	private void user_password(String password)
	{
		System.out.println("Password" +password);
	}
	

}
