package com.practice;

public class Constructor_D {
	
	int y= 45;
	public Constructor_D(){

		System.out.println("One");
		}


		public Constructor_D(int a){
this();
		System.out.println("Two"+ a);
		}

		public Constructor_D(String s){
this(34);
		System.out.println("Three"+s);
		}


		public static void main(String[] args){

int x=23;
			Constructor_D cons = new Constructor_D("Hamsa");
		
System.out.println(x);




		}


		private void Constructor_D(int i) {
			// TODO Auto-generated method stub
			
		}

}
