package com.practice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Prog {
	public static void main(String[] args){

		for(int i=1; i<=3; i++){

		   for(int j=8; j>=i; j--){
		System.out.print(j+ " ");

		}
		System.out.println();
		}
		for(int i=8; i>=6; i--){

			   for(int j=8; j>=i; j--){
			System.out.print(j+ " ");

			}
			System.out.println();
			}
		
		for(int i=1; i<=3; i++){

			   for(int j=1; j<=i; j++){
			System.out.print(i+ " ");

			}
			System.out.println();
			}
	}
	
	
	
	
	
}
