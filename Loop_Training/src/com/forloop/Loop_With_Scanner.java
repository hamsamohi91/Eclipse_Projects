package com.forloop;

import java.util.Scanner;

public class Loop_With_Scanner {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int ss = sc.nextInt();
		
		System.out.println("Enter the last number:");
		int si = sc.nextInt();
		
		System.out.println("START");
		
		for (int i = ss; i <=si; i++) {
			
			System.out.println(i);
		}
		
		System.out.println("END");
	}

}
