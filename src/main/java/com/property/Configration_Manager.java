package com.property;

import com.Maven_First.Configuration_Reader;

public class Configration_Manager {
	
	
	private Configration_Manager()
	{
		// restrict to create an object into the another class
	}
	
	public static Configration_Manager getInstance_File_Reader() {
		
		Configration_Manager cm=new Configration_Manager();
		
	return cm;
	}
	
	public Configuration_Reader getInstance_Config_Reader() throws Exception
	{
		Configuration_Reader cr=new Configuration_Reader();
		return cr;
	}
	
}
