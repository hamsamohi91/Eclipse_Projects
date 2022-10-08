package com.testng.features;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.object.manager.Project_Object_Manager_Adactin;
import com.singleton.pattern.File_Reader_Manager;
import com.utility.Utility_Files;

public class Timeout_Demo extends Utility_Files {

	public static WebDriver driver;
	
	public static Project_Object_Manager_Adactin manager;

	@Test(timeOut = 500000)
private void adactin() throws IOException {

	driver= get_Browser("chrome");
	
	String url = File_Reader_Manager.get_Instance_FRM().get_Instance_Reader().get_Url();		
    get(url);    

	manager = new Project_Object_Manager_Adactin(driver);
	String email = particular_Cell_Data("D:\\Hamsa\\Testing\\Test Case\\Test_Case_Adactin_Hotel.xlsx", 1, 5);
	send_Keys(manager.getHotel().getUname(), email);				

	String pwd = particular_Cell_Data("D:\\Hamsa\\Testing\\Test Case\\Test_Case_Adactin_Hotel.xlsx", 2, 5);
	send_Keys(manager.getHotel().getPwd(), pwd);

	
	click_On_Element(manager.getHotel().getLogin());	


	}	
}
