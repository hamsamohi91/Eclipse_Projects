package com.variables;

public class Local_Variables {

	private void variable_1() {
byte b = 25;//local variable

b = 45; //assign and override

System.out.println(b);
	}
	
	private void variable_2() {

		short s= 768;
	System.out.println(s);
	}
	public static void main(String[] args) {
		Local_Variables lvar = new Local_Variables();
		lvar.variable_1();
		lvar.variable_2();
	}
}
