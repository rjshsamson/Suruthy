package com.testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping_Concept {
	
	@Test(groups="Fruits")
	public void apple() {
		System.out.println("apple");
	}

	
	@Test(groups="Fruits")
	public void orange() {
		System.out.println("orange");
	}

	@Test(groups="Fruits")
	public void grapes() {
		System.out.println("grapes");
	}

	@Test(groups="Flowers")
	public void rose() {
		System.out.println("rose");
	}

	@Test(groups="Flowers")
	public void jasmine() {
		System.out.println("jasmine");
	}
	
	@Test(groups="Vegetables")
	public void tomato() {
		System.out.println("tomato");
	}
	
	@Test(groups="Vegetables")
	public void onion() {
		System.out.println("onion");
	}
	
	

}
