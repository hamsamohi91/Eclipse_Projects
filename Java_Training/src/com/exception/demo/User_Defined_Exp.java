package com.exception.demo;

public class User_Defined_Exp {

	static int age = 15;
	
	public static void age_Validation() {

		if(age>=18) {
		System.out.println("Eligible for vote");
	
		}
		
		else {
			
			throw new NullPointerException();
					
		}
	}
	
	public static void main(String[] args){
		
		age_Validation();
		
		
	}
	
	
}
