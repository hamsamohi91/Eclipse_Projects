package com.string.demo;

public class Immutable_String {
public static void main(String[] args) {
	
	String H = "Hamsa Mohideen";
	
	System.out.println("Memory Reference of H");
	System.out.println(System.identityHashCode(H));//to find memory reference
	
String H1 = "Hamsa Mohideen";

System.out.println("Memory Reference of H1");	
	System.out.println(System.identityHashCode(H1));
	
	H=H.concat(H1);//merging two string
	System.out.println(H);
	System.out.println("Memory Reference of H after merging with H1");

	System.out.println(System.identityHashCode(H));
	
}
	
	
	
}
