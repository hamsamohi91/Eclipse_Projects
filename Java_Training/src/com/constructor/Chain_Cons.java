package com.constructor;

public class Chain_Cons {

	public Chain_Cons() {
System.out.println("Empty means default");	
	}
	
	public Chain_Cons(int a) {
		this();
		System.out.println("Int Value: " + a);	
	}

	public Chain_Cons(long b) {
		this(35);
		System.out.println("Long Value: " + b);
			}
	public Chain_Cons(float c) {
		this(223323323l);
		System.out.println("Float Value: " + c);
			}
	public Chain_Cons(String d) {
	this(34.2324f);
		System.out.println("String Name: " + d);
			}

	public static void main(String[] args) {
		Chain_Cons ccs = new Chain_Cons("Hamsa");
	}
}
