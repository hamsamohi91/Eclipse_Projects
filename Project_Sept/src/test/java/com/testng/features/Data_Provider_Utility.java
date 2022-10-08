package com.testng.features;

import org.testng.annotations.DataProvider;

public class Data_Provider_Utility {

	@DataProvider
	private String[][] all_Data() {

		String[][] data = {
				
				{"Aus", "Smith"},
				{"Aus", "Starc"},
				{"Aus", "Maxwell"}
				
		
		                  };
		
return data;		
		
		}		
	
}
