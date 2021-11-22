package com.Maven_First;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Configuration_Properties {

	static Logger log = Logger.getLogger(Configuration_Properties.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
		
		
		
	}

}
