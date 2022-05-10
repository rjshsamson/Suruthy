package com.testngfeatures;

import org.testng.annotations.Test;

public class Dependency_Concept {

	@Test(enabled = false)
	public void BachelorDegree() {
		System.out.println("BachelorDegree");
	}
	@Test(dependsOnMethods = "BachelorDegree")
	public void MasterDegree() {
		System.out.println("MasterDegree");
	}

}
