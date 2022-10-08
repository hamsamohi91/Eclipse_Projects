package com.ifelse;

public class For_If_Break_Continue {

	public static void main(String[] args) {
		for (int i = 20; i >= 1; i--) {
			
			if (i==15) {
				continue;
			}
			else if (i==10) {
				break;
			}
		System.out.println(i);
		//System.out.println(i+10);
		}
	}
	
}
