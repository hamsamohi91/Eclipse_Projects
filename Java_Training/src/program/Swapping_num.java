package program;

import java.util.Scanner;

public class Swapping_num {

	static int x, y, t;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of x and y:");
		x= sc.nextInt();
		y= sc.nextInt();
		
		t=x;
		x=y;
		y=t;

		System.out.println("After swap: x =" +x + " y = "+y);

	int a = 34, b = 43, c=0;
	
	c=a;
	a=b;
	b=c;
	
	System.out.println("After swap: a =" +a + " b = "+b);

	}
}
