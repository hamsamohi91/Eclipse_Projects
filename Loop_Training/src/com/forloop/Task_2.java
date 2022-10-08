package com.forloop;

public class Task_2 {
public static void main(String[] args) {
	
	int i = 6;
	System.out.println("While Loop");
	System.out.println("Start");
	while (i>=1) {
		System.out.print("* ");
		i--;
	}
	System.out.println();
System.out.println("End");
System.out.println();
	
	int j = 1;
	System.out.println("Do While Loop");
	System.out.println("Start");
	
	do {
		System.out.print("* ");
		j++;
	} while (j<=6);
	
	System.out.println();
	System.out.println("End");
}
}
