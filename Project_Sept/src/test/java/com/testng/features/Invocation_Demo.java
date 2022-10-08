package com.testng.features;

import org.testng.annotations.Test;

public class Invocation_Demo {

	
	@Test(priority = 2)
	private void bus() {
		System.out.println("Bus");
			}

	
	@Test(priority = -1)
	private void cycle() {
System.out.println("Cycle");
	}
	
	
	@Test(priority = 1)
	private void car() {
		System.out.println("Car");
			}
	
	//invocationCount and invocationTimeOut
	
	//if we give invocationCount = 4, then it run the method 4 time

	//if we give invocationCount = 0, then it will not run the method

	@Test(priority = 1, invocationCount = 4)
	private void bike() {
		System.out.println("Bike");
			}
	

}
