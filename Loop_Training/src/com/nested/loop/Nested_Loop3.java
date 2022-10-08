package com.nested.loop;

public class Nested_Loop3 {

	public static void main(String[] args) {
	
		System.out.println("Start");
		for (int i = 4; i >=1; i--) {
		
		for (int j = 1; j <=i; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
		System.out.println("End");
		
	}
	
	
}
