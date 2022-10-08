package com.ifelse;

import java.util.Scanner;

public class If_Else_With_Scanner {
	public static void main(String[] args) {
		System.out.println("Student Grade System");
	
		for (int j = 1; j <= 3; j++) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Mark:");
		int i = scan.nextInt();
		
if ((i>90) && (i<100)) {
	System.out.println("Your Grade: S");
} 
else if ((i>80) && (i<91)) {
	System.out.println("Your Grade: A");
}
else if ((i>70) && (i<81)) {
	System.out.println("Your Grade: B");
}
else if ((i>60) && (i<71)) {
	System.out.println("Your Grade: C");
}
else if ((i>=55) && (i<61)) {
	System.out.println("Your Grade: D");
}
else if ((i>=50) && (i<55)) {
	System.out.println("Your Grade: E");
}

else if ((i<50)) {
	System.out.println("FAIL");
}			}}
}
