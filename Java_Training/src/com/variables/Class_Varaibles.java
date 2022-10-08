package com.variables;

public class Class_Varaibles {
	String s = "System"; // class initialization
	private void class_1() {
		s = "Slow"; //class assign
		System.out.println(s);
	}
	private void class_2() {
		String s = "Fast"; //local initialization
		System.out.println(s);
	}
	private void class_3() {
		System.out.println(s);//class variables
	}
	private void class_4() {
		String s = "Medium";//local initialization
System.out.println(s);
	}
	public static void main(String[] args) {
		Class_Varaibles cv = new Class_Varaibles();
		cv.class_3();
		cv.class_2();		
		cv.class_1();
		cv.class_4();
		cv.class_3();
		System.out.println(cv.s);//calling variables	
		// return type
		
		String s2 = cv.s; 
	System.out.println(s2);
	}
	
}
