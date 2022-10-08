package com.testng.features;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.object.manager.Project_Object_Manager_Adactin;
import com.singleton.pattern.File_Reader_Manager;
import com.utility.Utility_Files;

public class Parellel_Testing_Demo extends Utility_Files{

	public static WebDriver driver;
	
	public static Project_Object_Manager_Adactin manager;

	@Test
	private void adactin() throws IOException {

		driver= get_Browser("chrome");
		
		String url = File_Reader_Manager.get_Instance_FRM().get_Instance_Reader().get_Url();		
	    get(url);    

	}
	
	@Test
	private void facebook() {

		driver= get_Browser("chrome");
		
		get("https://www.facebook.com/");
	}
	
}
