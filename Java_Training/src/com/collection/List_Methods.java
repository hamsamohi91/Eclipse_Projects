package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_Methods {

	public static void main(String[] args) {

		List<Object> lt = new ArrayList<Object>();
		
		lt.add(23);
		lt.add("Java");
		lt.add(2, "Class");
		lt.add(45.34f);
		lt.add(33453455l);
		lt.add(null);
		lt.add(23);
		System.out.println(lt);
		
		int size = lt.size();
		System.out.println("Size of: "+size);
		
		int index = size-1;
		System.out.println("Index: "+index);
		
		int indexOf = lt.indexOf(23);
		System.out.println("First occurence of 23: "+indexOf);
		
		int lastIndexOf = lt.lastIndexOf(23);
		System.out.println("Last occurence of 23: "+lastIndexOf);
		
		boolean contains = lt.contains("Java");
        System.out.println("Contains or not: "+contains);
        
        Object obj = lt.get(1);
        System.out.println("1st index value: "+obj);
        
        lt.set(6, 43);
		System.out.println("After Replacing: "+lt);
		
		boolean empty = lt.isEmpty();
		System.out.println("Empty or not: "+empty);
		
		lt.clear();
		System.out.println("After clearing: "+lt);
		
		
	}

}
