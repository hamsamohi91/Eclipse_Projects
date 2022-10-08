package com.forloop;

public class Task_1 {

	public static void main(String[] args) {
System.out.println("For Loop");
		for (int i = 26; i <= 37; i++) {
			System.out.print(i+ ", ");
		}
	System.out.println();
	
	System.out.println("While Loop");
	int j = 26;
	
	while (j<=37) {
		System.out.print(j+ ", ");
		j++;
	}
System.out.println();
	
	System.out.println("Do While Loop");
	
	int k = 26;
	do {
		System.out.print(k+ ", ");
		k++;
		
	} while (k<=37);
	
	}
}
