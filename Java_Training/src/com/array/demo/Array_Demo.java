package com.array.demo;

public class Array_Demo {

	
	public static void main(String[] args) {
		
		// DataType refName[] = new DataType[length];
		
		int x[] = new int[5]; //array syntax
		
		x[0] = 1; // index
		//x[1] = 2;	
		x[2] = 3;
		x[3] = 4;
		x[4] = 5;
		
		System.out.println("For Loop");
		for (int i = 0; i < x.length; i++) {
			
			System.out.println(x[i]);
		}
		
		System.out.println("For Loop/Nested For Loop");
		
		for (int i : x) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int i = x[0]; i < x.length; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
	}
	
	
	
}
