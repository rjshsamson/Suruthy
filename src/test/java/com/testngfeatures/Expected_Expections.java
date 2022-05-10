package com.testngfeatures;

import org.testng.annotations.Test;

public class Expected_Expections {
	@Test(expectedExceptions = ArithmeticException.class)
	public void calc() {
		int a = 20;
		System.out.println(a / 0);
	}
	@Test(expectedExceptions = NullPointerException.class)
	public void pass() {
		int b = 10;
		System.out.println(b / 0);
	}

}
