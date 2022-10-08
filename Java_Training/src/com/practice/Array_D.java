package com.practice;

public class Array_D {

	
	public static void main(String[] args) {
		
		int a[] = new int[4];

		a[0] = 1;
		a[1]= 2;
		a[2]= 3;
		a[3]= 4;
		
		System.out.println(a[0]);
		
		for(int i = 0; i<a.length; i++){

			System.out.println(a[i]);

			}
		
		for(int aa : a){

			System.out.println(aa);
			}
		
		String s[] = {"Hamsa", "Mohideen", "R."};
		
		int n = s.length;
		System.out.println(n);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		for (String string : s) {
			System.out.println(string);
		}
		
	}
}
