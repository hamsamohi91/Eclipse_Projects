package com.typecasting.training;

public class Type_Casting {


public static void main(String[] args) {
	//Widening
	
	float fl = 5.7878f;
	
	double dl = fl;
		System.out.println("Double Value = " + dl);	
	
		
		//Narrowing
		float ffl = (float) dl;
		System.out.println("Float Value = " + ffl);
}

}
