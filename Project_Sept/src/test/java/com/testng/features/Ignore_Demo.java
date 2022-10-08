package com.testng.features;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class Ignore_Demo {

	@Test(groups = "Entertainment")
	private void beach() {

		System.out.println("Beach");
	}
	
	@Test(groups = "HW")
	private void office() {
System.out.println("Office");
	}
	
	//Way 1
	@Test(alwaysRun = true, enabled = false, groups = "Entertainment")
	private void park() {
System.out.println("Park");
	}
	
	//Way 2
	@org.testng.annotations.Ignore
	@Test(groups = "Entertainment")
	private void mall() {

		System.out.println("Mall");
	}
	
	@Test(groups = "HW")
	private void house() {

		System.out.println("House");
	}
	
}
