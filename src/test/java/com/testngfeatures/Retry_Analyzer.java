package com.testngfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Analyzer {
	@Test
	public void demousername() {
		
		String exp="Keerthi";
		String act="Keerthi";
		Assert.assertEquals(exp, act);

	}
	
	@Test
	public void demopassword() {
		
		String exp="123";
		String act="678";
		Assert.assertEquals(exp, act);

	}

}
