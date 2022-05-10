package com.testngfeatures;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	public void PropertySetting() {
		System.out.println("Property_Setting");
	}

	@BeforeTest
	public void browserlaunch() {
		System.out.println("Browser_Launch");
	}

	@BeforeClass
	public void url() {
		System.out.println("url_Launch");
	}

	@BeforeMethod
	public void signin() {
		System.out.println("signin");
	}

	@Test(priority = 3)
	public void Aged() {
		System.out.println("Aged");

	}

	@Test(priority = 1)
	public void youth() {
		System.out.println("YOUTH");

	}

	@Test(priority = 2,invocationCount = 3)
	public void kids() {
		System.out.println("KIDS");

	}

	@AfterMethod
	public void Signout() {
		System.out.println("Signout");

	}

	@AfterClass
	public void homepage() {
		System.out.println("homepage");

	}

	@AfterTest
	public void DeletCookies() {
		System.out.println("DeletCookies");

	}

	@AfterSuite
	public void quit() {
		System.out.println("quitbrowser");

	}

}
