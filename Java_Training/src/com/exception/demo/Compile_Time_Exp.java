package com.exception.demo;

public class Compile_Time_Exp {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hamsa");
		
		Thread.sleep(3000);//while implementing this method, it will throw compile time excep
		
		//after implementing throws keyword, compile time exp is handled
		
		System.out.println("Mohideen");
		
	}
}
