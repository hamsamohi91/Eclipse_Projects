package com.exception.demo;

public class Election_Board {

	public static int age =13;
	
	public  static void age_Validation() throws My_Exception { //Here we can 
		                                             //also give Exception for throws
		
		
		//here My_Exception extends from Exception, hence My_Exception 
		//becomes child exception
if (age>=18) {
	System.out.println("Eligible");
} else {
throw new My_Exception();
}		
}
public static void main(String[] args) throws My_Exception {
	age_Validation();
}	
	
}
