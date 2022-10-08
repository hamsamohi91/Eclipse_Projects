package com.polymorphism.overloading;

public class Student_Details {

	public void student_Info(String firstname, String lastname) {

		System.out.println("Student Firstname: " + firstname);
		System.out.println("Student Lastname: " + lastname);
	}

	public void student_Info(int age) {

		System.out.println("Student Age: " + age);
		
	}

	public void student_Info(String gender) {

		System.out.println("Student Gender: " + gender);
	}

	public void student_Info(String address, int pin) {

		System.out.println("Student Address: " + address);
		System.out.println("Pincode: " + pin);
	}

	public void student_Info(String fathername, char finitial) {
		System.out.println("Student Father's Name: " + fathername);
		System.out.println("Student Father's Initial: " + finitial);
	}

	public void student_Info(char minitial, String mothername) {
		System.out.println("Student Mother's Name: " + mothername);
		System.out.println("Student Mother's Initial: " + minitial);
	}

	public void student_Info(long accno) {
		System.out.println("Student Acc. No.: " + accno);
	}

	public static void main(String[] args) {
		Student_Details inf = new Student_Details();

		inf.student_Info("Hamsa", "Mohideen");
		inf.student_Info(28);
		inf.student_Info("Male");
		inf.student_Info("Mannady, Chennai", 600001);
		inf.student_Info("Rahmathullah", 'S');
		inf.student_Info('R', "Meera");
		inf.student_Info(715158035l);
	}
}
