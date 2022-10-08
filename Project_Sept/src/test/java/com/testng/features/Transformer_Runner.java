package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Transformer_Runner {

	@Test
	private void demo1() {

		String s1 = "New York";
		
		String s2 = "Houston";
		
		Assert.assertEquals(s1, s2);
		
	}

	
	@Test
	private void demo2() {

		String s1 = "Chennai";
		
		String s2 = "Madurai";
		
		Assert.assertEquals(s1, s2);
		
	}

	
	
}
