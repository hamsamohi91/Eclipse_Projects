package com.variables;

public class Static_Variables {

	static short s = 343;

	public void st_Variable1() {
		System.out.println("Static value: " + s);
	}

	private void st_Variable2() {

		s = 654;
		System.out.println(s);
	}

	public static void main(String[] args) {
		Static_Variables st = new Static_Variables();

		st.st_Variable2();
		st.st_Variable1();
		System.out.println(s);
	//return type
		short s2 = s;
System.out.println("Return Type: "+s2);		
	}
}
