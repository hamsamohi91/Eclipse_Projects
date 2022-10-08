package com.testng.features;

import org.testng.annotations.Test;

public class Data_Provider_Runner {

	@Test(dataProvider = "all_Data", dataProviderClass = Data_Provider_Utility.class)			
	private void player_Data(String us, String ps) {

		System.out.println("Team: "+us);
		System.out.println("Player: "+ps);
	}

	
}
