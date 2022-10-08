package com.string.demo;

public class String_Demo2 {
	public static void main(String[] args) {
		String H = "Hamsa*Mohideen#46498"; 

		System.out.println("Method 1: "+H.replaceAll("[^a-z]", " "));		
		System.out.println("Method 2: "+H.replaceAll("[^a-zA-Z]", " "));
		System.out.println("Method 3: "+H.replaceAll("[^a-zA-Z0-9]", " "));
		
		System.out.println(H.indexOf('a', 2));
	}

}
