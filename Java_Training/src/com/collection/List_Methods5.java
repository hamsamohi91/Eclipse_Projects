package com.collection;
import java.util.ArrayList;
import java.util.List;
public class List_Methods5 {
public static void main(String[] args) {
List<Object> al = new ArrayList<Object>();		
	al.add('i');
	al.add('j');
	al.add('k');
	al.add('o');
	al.add('l');
	al.add('m');
	al.add('n');
	al.add('o');
System.out.println("List: "+al);
String string = al.toString();//conversion from List to String with Return type
System.out.println("String: "+string);
System.out.println("Length: "+string.length());

int index = string.length() - 1;
System.out.println("Index: "+index);
	
int indexOf = string.indexOf('o');
System.out.println("First occurence of o: "+indexOf);
	
int lastIndexOf = string.lastIndexOf('o');
System.out.println("Last occurence of o:"+lastIndexOf);
	
String[] split = string.split("");
for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
}
	
	
	
}
