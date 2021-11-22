package com.Maven_First;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Configuration_Reader {

	// to read the data from .properties file

	public static Properties props; // -->null

	public Configuration_Reader() throws Exception {

		/*
		 * to create a path for the particular properities file and its converting from
		 * .properities file to FILE format
		 */

		File file = new File(
				"C:\\Users\\Jaicj\\eclipse-workspace\\Maven_First\\src\\main\\java\\com\\property\\PropertyFile.properties");

		// FileInputStream using to read the file
		FileInputStream in = new FileInputStream(file);

		// need to create object for properties then only we can load the file.

		props = new Properties();
		// loading the file

		props.load(in);

	}

	public String getURL() throws Exception {

		String url = props.getProperty("url");

		return url;

	}

	// here we are returning the value so that we should not create the object for
	// this in another class

	public String getUsername() throws Exception {

		String username = props.getProperty("username");

		return username;

	}

	public String getPassword() throws Exception {

		String password = props.getProperty("password");

		return password;

	}

	public String getLogin() {
		String login = props.getProperty("login");
		return login;

	}

	public String getLocation() {

		String location = props.getProperty("location");
		return location;
	}

	public String getAdults_Room() {
		String adults = props.getProperty("adult_room");
		return adults;
	}

	public String getSubmit() {
		String login = props.getProperty("submit");
		return login;

	}

	public String getRadio_btn() {
		String radio_btn = props.getProperty("radio");
		return radio_btn;

	}

	public String getCont_btn() {
		String cont_btn = props.getProperty("cont_btn");
		return cont_btn;

	}

	public String getFirst_name() {
		String first_name = props.getProperty("first_name");
		return first_name;

	}

	public String getCredit_type() {
		String credit_type = props.getProperty("credit_type");
		return credit_type;

	}

	public String getMonth() {
		String month = props.getProperty("month");
		return month;

	}

	public String getBook_Now() {
		String book_now = props.getProperty("book_now");
		return book_now;

	}

	public String getLiberary() {
		String liberary = props.getProperty("liberary");
		return liberary;

	}

	public String getLogout() {
		String Logout = props.getProperty("Logout");
		return Logout;

	}

}
