package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Readaer {

	public static Properties p;

	public Configuration_Readaer() throws Throwable {

		File f = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String geturl() throws Throwable {

		String url = p.getProperty("url");
		return url;

	}

	public String getusername() throws Throwable {

		String username = p.getProperty("username");
		return username;

	}

	public String getpassword() throws Throwable {

		String password = p.getProperty("password");
		return password;

	}

	public String getFirstName() throws Throwable {

		String FirstName = p.getProperty("FirstName");
		return FirstName;

	}

	public String getLastName() throws Throwable {

		String LastName = p.getProperty("LastName");
		return LastName;

	}

	public String getBillingAddress() throws Throwable {

		String BillingAddress = p.getProperty("BillingAddress");
		return BillingAddress;

	}

	public String getCreditCard() throws Throwable {

		String CreditCard = p.getProperty("CreditCard");
		return CreditCard;

	}

	public String getCVV() throws Throwable {

		String CVV = p.getProperty("CVV");
		return CVV;

	}

}
