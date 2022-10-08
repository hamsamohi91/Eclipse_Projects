package com.inheritance.training;

public class Multilevel_Inheritance extends Single_Inheritance_Extends {

	private void child_D() {
System.out.println("Child D");
	}
	
	public static void main(String[] args) {
		Multilevel_Inheritance multi = new Multilevel_Inheritance();
		multi.child_D();
		multi.child_C();
		multi.parent_B();
		multi.parent_A();
	}
}
