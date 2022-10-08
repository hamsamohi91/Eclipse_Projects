package com.exception.demo;

public class Try_Catch {
	
	public static void main(String[] args) {
		int a = 10;
		
		try {
			System.out.println(a);
			System.out.println(a/0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Process completed");
		}
		finally{
			
		System.out.println("aaa");	
		}
	}
}
