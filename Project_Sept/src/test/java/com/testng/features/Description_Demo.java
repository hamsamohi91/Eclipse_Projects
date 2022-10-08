package com.testng.features;

import org.testng.annotations.Test;

public class Description_Demo {
	@Test(priority = 2, description = "Benz Bus")
	private void bus() {
		System.out.println("Bus");
			}

	
	@Test(priority = -1, description = "Hero Cycle")
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
