package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {

@Test
	private void Hard_Assert() {

	String s1 = "Java";	
	String s2 = "java";
	System.out.println("Before Assert");

	Assert.assertEquals(s1, s2);

	System.out.println("Success");
	}
	
@Test	
private void soft_Assert() {

	String s1 = "Selenium";	
	String s2 = "selenium";
	System.out.println("Before Assert");

	SoftAssert soft = new SoftAssert();
	
	soft.assertEquals(s1, s2);

	System.out.println("Success");
	
	
}

}
