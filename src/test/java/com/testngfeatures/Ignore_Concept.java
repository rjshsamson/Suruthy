package com.testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test
	public void apple() {
		System.out.println("apple");
	}

	@Ignore
	@Test
	public void orange() {
		System.out.println("orange");
	}

	@Test
	public void grapes() {
		System.out.println("grapes");
	}

	@Test
	public void rose() {
		System.out.println("rose");
	}

	@Test(enabled=false)
	public void jasmine() {
		System.out.println("jasmine");
	}

}
