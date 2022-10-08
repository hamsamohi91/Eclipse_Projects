package com.constructor;

public class Constructor {

	public Constructor() {
System.out.println("Default");
	}
	
	public Constructor(String a) {
		System.out.println("String: " + a);
			}
	
	public Constructor(int b) {
		System.out.println("Int: " + b);
			}
	
	public Constructor(float c) {
		System.out.println("Float: " + c);
			}
	
	public Constructor(long d) {
		System.out.println("Long: " + d);
			}
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor("Hamsa");
		Constructor c3 = new Constructor(3122);
		Constructor c4 = new Constructor(123.334f);
		Constructor c5 = new Constructor(123442323441213l);
	
	}
	
	
	
}
