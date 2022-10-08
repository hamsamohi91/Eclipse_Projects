package com.polymorphism.overloading;

public class Staff_Data extends Student_Details{
	
	
	@Override
	public void student_Info(char minitial, String mothername) {
		System.out.println("Parents");
		super.student_Info(minitial, mothername);
	}
	
	@Override
	public void student_Info(String fathername, char finitial) {
		super.student_Info(fathername, finitial);
	}
	
	@Override
	public void student_Info(int age) {
		super.student_Info(age);
	}
	public static void main(String[] args) {
		
		Staff_Data data = new Staff_Data();
	
		
		data.student_Info('R', "Meera");
	data.student_Info("Rahmathullah", 'S');
	data.student_Info(54);
	}
	

}
