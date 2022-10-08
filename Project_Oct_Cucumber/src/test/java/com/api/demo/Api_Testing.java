package com.api.demo;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api_Testing {

	
	@Test
	public void Api() {

		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("/api/users/2");
		
		String body = response.asString();
		
		System.out.println("Status Body: "+body);
		
		
		String statusLine = response.getStatusLine();

	System.out.println("Status Line: "+statusLine);

	int statusCode = response.getStatusCode();
	
	System.out.println("Status Code: "+statusCode);



org.junit.Assert.assertEquals(200, statusCode);
System.out.println("Success");
	
	}
	
	
	
	
}
