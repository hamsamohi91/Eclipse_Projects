package com.inheritance.training;

public class Single_Inheritance_Extends extends Single_Inheritance {

	public void child_C() {
		System.out.println("Child C");

	}
	
	public static void main(String[] args) {
		
		Single_Inheritance_Extends single = new Single_Inheritance_Extends();
		
		single.parent_A();
		single.parent_B();
		single.child_C();
		
	}
}
