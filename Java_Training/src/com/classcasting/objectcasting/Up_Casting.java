package com.classcasting.objectcasting;

public class Up_Casting {

	public void parent() {
System.out.println("Parent Advice");
	}
	
public static void main(String[] args) {
	Up_Casting cast = new Up_Casting_Call();
	
	cast.parent(); //Upcasting
}	
}
