package com.wipro.software;

public class Trainee_Details {

	private void trainee_Name() {
		
		System.out.println("Name: Hamsa");
	}
private void trainee_Age() {
		
		System.out.println("Age: 21");
	}

private void trainee_Exp() {
	
	System.out.println("Exp: 8 Years");
}

private void trainee_Contact() {
	
	System.out.println("Contact: 8939665158");
}

private void trainee_Address() {
	
	System.out.println("Address: Chennai");
}

public static void main(String[] args) {
	//System.out.println("Hamsa");

	Trainee_Details details = new Trainee_Details();
			
			details.trainee_Name();
			details.trainee_Age();
			details.trainee_Exp();
			details.trainee_Contact();
			details.trainee_Address();

}

}






