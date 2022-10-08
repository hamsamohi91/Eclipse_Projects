package com.string.demo;

public class Mutable_String_Buffer_And_Builder {
public static void main(String[] args) {
StringBuffer H = new StringBuffer("Hamsa Mohideen");
	
	System.out.println("Memory Reference of H");
	System.out.println(System.identityHashCode(H));//to find memory reference
	
	StringBuffer H1 = new StringBuffer("Hamsa Mohideen");

	
System.out.println("Memory Reference of H1");	
	System.out.println(System.identityHashCode(H1));
	
	H=H.append(H1);//merging two string
	
	System.out.println(H);
	System.out.println("Memory Reference of H after merging with H1");

	System.out.println(System.identityHashCode(H));

}
}
