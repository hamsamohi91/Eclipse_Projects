package com.testng.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Single_Parameter_DataParsing {
	
	@Parameters({"user", "pass"})
	@Test
	private void demo(String user, String pass) {

		System.out.println("Username: "+ user);
		System.out.println("Password: "+pass);
		
	}

	//if parameter passed is mismatched, then the exception will come
	//that case we can pass @optional annotation at method level
	
	@Parameters({"User", "pass"})
	@Test
	private void demo2(@Optional("Hamsa2")String user, String pass) {

		System.out.println("Username: "+ user);
		System.out.println("Password: "+pass);
		
	}

	

}
