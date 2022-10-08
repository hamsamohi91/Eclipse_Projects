package com.string.demo;

public class StringBuffer_Methods {
public static void main(String[] args) {
	
	StringBuffer bf = new StringBuffer("Hamsa");
	
	System.out.println("String Buffer: " +bf);
	
	System.out.println("After Append: "+ bf.append(" Mohideen"));
	
	System.out.println("After Insert: "+bf.insert(0, "R, "));
	
	System.out.println("After Replace: "+bf.replace(0, 2, "R."));
	
	System.out.println("After Delete: "+bf.delete(0, 2));
	
	System.out.println("After Insert: "+bf.insert(15, " R."));
	
	System.out.println("After Replace: "+bf.reverse());
}
}
