package com.testng.features;

import org.testng.annotations.Test;

public class Depends_On_Methods_Demo {

	@Test(priority = 2)
	private void bus() {
		System.out.println(10 / 0);
	}

	//if depending method is failed, then the depends
	//on method will be skipped
	
	//if alwaysRun method set to true, this method
	//will run even if it depends on method is failed
	
	@Test(priority = -1, dependsOnMethods = "bus", 
			alwaysRun = true)
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
