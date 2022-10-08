package com.junit.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo {

	
	@Test
	public void casual_Dress() {

		System.out.println("Casual Dress");
	}
	
	
	@Test
	public void evening_Dress() {
System.out.println("Evening Dress");
		
	}
	
	@Test
	public void summer_Dress() {

		System.out.println("Summer Dress");
	}
	
	
	@Before
	public void login() {
System.out.println("Login");
	}
	
	@After
	public void logout() {
	
		System.out.println("Logout");
	}
}
