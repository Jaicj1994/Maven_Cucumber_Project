package com.TestNG_Features;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameters_B  {
	
	
	@Test (priority=1)
	@Parameters({"run"})
	private void runthisclass_First(String run) {
		System.out.println("This is Beforeclass Method in Parameters_B: " + run);
	}
	
	


}
