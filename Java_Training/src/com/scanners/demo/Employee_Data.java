package com.scanners.demo;

import java.util.Scanner;

public class Employee_Data {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	System.out.println("Enter the employee full name - ");
	String fullname = scan.nextLine();
	System.out.println("Employee Full Name: " + fullname);
		
	System.out.println("Enter the employee name - ");
	String ename = scan.next();
	System.out.println("Employee Name: " + ename);
	
	System.out.println("Enter the employee age - ");	
	byte age = scan.nextByte();
	System.out.println("Age: "+age);
	
	System.out.println("Enter the employee ID - ");
	short id = scan.nextShort();
	System.out.println("ID: "+id);
	
	System.out.println("Enter the employee pincode - ");
	int pin = scan.nextInt();
	System.out.println("Pincode: "+pin);
	
	System.out.println("Enter the employee mobile number - ");
	long mob = scan.nextLong();
	System.out.println("Mobile: "+mob);
	
	System.out.println("Enter the employee salary - ");
	float sal = scan.nextFloat();
	System.out.println("Salary: "+sal);
	}

}
