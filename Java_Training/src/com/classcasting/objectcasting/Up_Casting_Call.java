package com.classcasting.objectcasting;

public class Up_Casting_Call extends Up_Casting {

	@Override
	public void parent() {
		System.out.println("Child Response");
		//super.parent();
	}
public static void main(String[] args) {
	
	Up_Casting_Call cast = new Up_Casting_Call();
	
	cast.parent();
}	
}
