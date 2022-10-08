package com.keywords;

public class Return {

	int a = 564;
int c= 45;
	static int b = 23;
	private int m_A() {       //method

		a = 765;
		System.out.println(a);
		System.out.println(a+10);
		System.out.println(c);

		return a;
			}
	
	private int m_B() {

		System.out.println(a+b);
		
return a+b;
	}

	public static void main(String[] args) {
		
		Return reta = new Return();

		reta.m_A();
		reta.m_B();

	}
	
}
