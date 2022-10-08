package com.switches;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
System.out.println("Choose anyone of the color to know about yourself: White, Red, Green");
		for (int i = 1; i <=3; i++) {
Scanner scn = new Scanner(System.in);			
String c = scn.nextLine();		

switch (c) {
case "White":
System.out.println("You are an Intelligent Person");
break;
case "Red":
System.out.println("You are having a helping tendency");
break;
case "Green":
System.out.println("You are having a Cool and Calm attitude");
break;	
default:
break;
		}

}			}

}
