package com.abstraction.partial;

public abstract class Father {
	
//Non-abstract
public void dress() {

	System.out.println("New Dress");
}
//Non-abstract
public void jewels() {
System.out.println("Jewellary");
}

//Abstract

public abstract void wallet();

public abstract void mobile();

public static void main(String[] args) {
	Father f = new Daughter(); //upcasting
	
	f.wallet();
	f.jewels();
	f.dress();
	f.mobile();
}
}

