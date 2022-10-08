package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_Methods3 {

	public static void main(String[] args) {
		
List<Object> al = new ArrayList<Object>();		
		al.add(23);
		al.add(11);
		al.add(4);
		al.add(null);
		
List<Object> al2 = new ArrayList<Object>();
		al2.add(34);
		al2.add(11);
		al2.add(3);
		al2.add(null);
		al2.add(0);
	
al.addAll(al2);
System.out.println("After adding two list: "+al);
		
al.remove(8);	
System.out.println("After removing 7th index : "+al);
		
al.retainAll(al2);
System.out.println(al);
		
al.removeAll(al2);
System.out.println(al);

}
	
	
}
