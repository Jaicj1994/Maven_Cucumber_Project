package com.Demo_programs;

public class Demo_Config_Manager {
	
	private Demo_Config_Manager()
	{
		
	}
	
	public static Demo_Config_Manager getInstanceDemo_Config() {
		
		Demo_Config_Manager dcm=new Demo_Config_Manager();
		
		return dcm;
	}
	
	public Demo_Configuration_Reader getInstanceDemo_Config_Reader() throws Throwable {
		
		Demo_Configuration_Reader dcr=new Demo_Configuration_Reader();
		return dcr;
		
	} 
	
		
	

}
