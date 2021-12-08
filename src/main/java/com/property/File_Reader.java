package com.property;

import com.Maven_First.Configuration_Reader;

public class File_Reader {
	
	private File_Reader()
	{
		// restrict to create an object into the another class
	}
	
	//retrun the File_Reader 
	public static File_Reader getInstance_File_Reader() 
	{	
		
		File_Reader fr= new File_Reader();
		return fr;
		
	}
	 //retrun the Configuration_Reader  
	public Configuration_Reader getInstance_Config_Reader() throws Exception {
		
		Configuration_Reader cr=new Configuration_Reader();
		return cr;
	}

}
//String url = File_Reader.getInstance_File_Reader().getInstance_Config_Reader().getURL();