package com.keywords;

public class This_And_Super extends Final_A {
static int a = 20;
	private void m1() {
System.out.println(super.a);
	System.out.println(this.a);
	}

	
	public static void main(String[] args) {
		This_And_Super key = new This_And_Super();
		
		key.m1();
	}
}
