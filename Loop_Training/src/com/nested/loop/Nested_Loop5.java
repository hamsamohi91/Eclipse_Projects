package com.nested.loop;

public class Nested_Loop5 {
	public static void main(String[] args) {
		
		System.out.println("Start");
		for (int i = 1; i <=3; i++) {
			
			for (int j = 1; j <=i; j++) {
				System.out.print("AB ");
			}
System.out.println();
		}
		System.out.println("End");
	}
}
