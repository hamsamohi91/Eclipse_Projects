package com.exception.demo;

public class Number_Format_Exp {

	public static void main(String[] args) {
		
		String s= " 21";
		
		System.out.println(s+10);
	
	//Integer.parseInt(s);//since conversion of space from String to int is not possible,
	
	//it will throw NumberFormatExeption
	
	//System.out.println(s);
	
	int i = 20;
	
	System.out.println(i);
	
	String valueOf = String.valueOf(i);//conversion of int to String
	
	System.out.println(valueOf);
	}
	
	
}
