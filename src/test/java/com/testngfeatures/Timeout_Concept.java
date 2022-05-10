package com.testngfeatures;

import org.testng.annotations.Test;

public class Timeout_Concept {
	@Test(timeOut = 9000)
	public void login() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Browser Lauch");
		
		Thread.sleep(2000);
		System.out.println("URl Lauch");
		
		Thread.sleep(3000);
		System.out.println("Login");

	}

}
