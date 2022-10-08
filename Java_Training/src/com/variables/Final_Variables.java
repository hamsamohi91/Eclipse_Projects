package com.variables;

public class Final_Variables {


	final long l = 22332444l;
	
	private void fn_Variable1() {
long l = 6757687l;
System.out.println("Long Value: " +l);
	}
	
	private void fn_Variable2() {
System.out.println("Final Value: " +l);
	}
	
	public static void main(String[] args) {
		Final_Variables fn = new Final_Variables();
		
		fn.fn_Variable1();
		fn.fn_Variable2();
		
		//return type
		
		long l2 = fn.l;
System.out.println("Return Type: " +l2);
	}
}
