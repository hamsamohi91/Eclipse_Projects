package com.string.demo;

import javax.sql.rowset.Joinable;

public class String_Demo {
public static void main(String[] args) {
	String st = "abcdefghijklmnopqrstuvwxyz";
			
			st.length();
			System.out.println("Length: "+st.length());
	
			int index = st.length() -1 ;
			System.out.println("Index: "+ index);
			
			boolean equals = st.equals("abcd");
			System.out.println("Equals Method: " + equals);
			
			boolean equalsIgnoreCase = st.equalsIgnoreCase("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			System.out.println("Equals Ignore Method:" +equalsIgnoreCase);
			
			String upperCase = st.toUpperCase();
System.out.println("Upper Case Method: "+ upperCase);
            
            String lowerCase = st.toLowerCase();
            System.out.println("Lower Case Method: "+ lowerCase);
            
            char charAt = st.charAt(25);
            System.out.println("Char At: "+ charAt);
            
            int indexOf = st.indexOf('a');
            System.out.println("Index of First Char.: " + indexOf);

            int lastIndexOf = st.lastIndexOf('z');
System.out.println("Index of Last Char.: "+lastIndexOf);

boolean contains = st.contains("erwty");
System.out.println("Contains Method: "+contains);

boolean startsWith = st.startsWith("bc");
System.out.println("Starts With: " + startsWith);

st.endsWith("xyz");
System.out.println("Ends With: " + st.endsWith("xyz"));

String sc = "   dd ddd   dddd   ";
sc= sc.trim();
System.out.println("Trim case: "+sc);

String replace = st.replace("ab", "11");
System.out.println("Replace: "+replace);

String concat = st.concat(" is a alphabets");
System.out.println(concat);

String substring = st.substring(4);
System.out.println("SubString: "+substring);

String substring2 = st.substring(2, 5);
System.out.println("SubString2: "+substring2);

String a= String.join("-", "a", "b", "c");
System.out.println("Join: "+a);

boolean empty = st.isEmpty();
System.out.println("st is empty or not: "+ empty);

String[] split = st.split(" ");
//String[] split = st.split("");
for (int i = 0; i < split.length; i++) {
	System.out.println(split[i]);
	
	
	
}
}
	
	
	
}
