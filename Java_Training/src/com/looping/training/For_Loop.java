package com.looping.training;

public class For_Loop {

	public static void main(String[] args) {
		System.out.println("Decrement");
		for (int a = 5; a >= 1; a--) {
			System.out.println(a);
		}
		
		System.out.println("Increment");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("Decrement with addition of 10");
		for (int a = 5; a >= 1; --a) {
			System.out.println(a+10);
		}
	}

}
