package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_Methods4 {

	public static void main(String[] args) {
		
List<Object> al = new ArrayList<Object>();		
		al.add(23);
		al.add(11);
		al.add(4);
		al.add(null);
		

		System.out.println(al);
	Object[] array = al.toArray();//conversion from List to Array
	
	for (int i = 0; i < array.length; i++) {
		
		System.out.println(array[i]);
		}

		System.out.println("Length: "+array.length);

	
}
}