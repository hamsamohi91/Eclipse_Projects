package com.inheritance.training;

public class Single_Inheritance {

	public void parent_A() {
		System.out.println("Parent A");
	}

	public void parent_B() {
		System.out.println("Parent B");

	}
public static void main(String[] args) {
	Single_Inheritance sin = new Single_Inheritance();
	
	sin.parent_A();
	sin.parent_B();
}
}
