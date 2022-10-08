package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzer_Runner {

	@Test(retryAnalyzer = RetryAnalyzer_Utility.class)
	private void demo1() {

		String s1 = "New York";
		
		String s2 = "Houston";
		
		Assert.assertEquals(s1, s2);
		
	}
	
	
}
