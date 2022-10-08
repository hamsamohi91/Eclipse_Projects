package com.abstraction.fullyinterface;

public class Implements_Class implements Interface_1, Interface_2 {

	@Override
	public void Guest_Room() {
		System.out.println("Guest Room: 20 x 20 = 400 sq. ft.");
	}

	@Override
	public void Rest_Room() {
		System.out.println("Rest Room: 6 x 6 = 36 sq. ft.");
	}

	@Override
	public void Living_Room() {
		System.out.println("Living Room: 10 x 15 = 150 sq. ft.");
	}

	@Override
	public void Master_Bed_Room() {
		System.out.println("Master Bed Room: 10 x 20 = 200 sq. ft.");
	}
	
	private void Kitchen() {
System.out.println("Kitchen: 10 x 10 = 100 sq. ft.");
	}
public static void main(String[] args) {
	Implements_Class imp = new Implements_Class();
	
	imp.Living_Room();
	imp.Master_Bed_Room();
	imp.Guest_Room();
	imp.Kitchen();
	imp.Rest_Room();
}
}
