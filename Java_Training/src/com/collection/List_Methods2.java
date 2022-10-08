package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_Methods2 {

	public static void main(String[] args) {

		List<Object> lt = new ArrayList<Object>();
		
		lt.add(23);
		lt.add("Java");
		lt.add(2, "Class");
		lt.add(45.34f);
		lt.add(33453455l);
		lt.add(null);
		lt.add(23);
	System.out.println("For Loop");
	for (int i = 0; i < lt.size(); i++) {//For Loop
		System.out.println(lt.get(i));
	}
	System.out.println("For each loop");
	for (Object value: lt) {//For each loop
		System.out.println(value);
	}
	}
}
