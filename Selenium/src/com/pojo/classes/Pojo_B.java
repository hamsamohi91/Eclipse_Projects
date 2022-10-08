package com.pojo.classes;

public class Pojo_B {

	
	
	public static void main(String[] args) {
		
		Pojo_A p = new Pojo_A();
		
		
		int value = p.getA();
		System.out.println("Before set: "+value);

p.setA(23);
		
System.out.println("After set: " + p.getA());
	

p.setB("Hamsa");

System.out.println("After set: "+ p.getB());
	}
}
