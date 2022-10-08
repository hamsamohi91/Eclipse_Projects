package com.testng.features;

import org.testng.annotations.Test;

public class Priority_Demo {
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
	@Test
	private void bike() {
		System.out.println("Bike");
			}
	
	
}
