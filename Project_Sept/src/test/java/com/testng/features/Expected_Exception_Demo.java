package com.testng.features;

import org.testng.annotations.Test;

public class Expected_Exception_Demo {

	
	@Test
	private void calculator_1() {

		System.out.println(10/2);
	}
	
	@Test(expectedExceptions =  ArithmeticException.class )
	private void calculator_2() {

		System.out.println(10/0);
	}
	
	@Test()
	private void calculator_3() {

		System.out.println(5/0);
	}
	
}
