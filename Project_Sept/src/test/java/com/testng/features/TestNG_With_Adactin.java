package com.testng.features;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.object.manager.Project_Object_Manager_Adactin;
import com.singleton.pattern.File_Reader_Manager;
import com.utility.Utility_Files;

public class TestNG_With_Adactin extends Utility_Files{

	
	public static WebDriver driver;
	
	public static Project_Object_Manager_Adactin manager;
	
	@BeforeClass
	private void browser_Launch() throws IOException {

		driver= get_Browser("chrome");
	
		String url = File_Reader_Manager.get_Instance_FRM().get_Instance_Reader().get_Url();		
        get(url);    
        
	}
	
	
    @BeforeMethod
    private void login_Method() throws IOException {
		implicit_Wait(15);

    	manager = new Project_Object_Manager_Adactin(driver);
		String email = particular_Cell_Data("D:\\Hamsa\\Testing\\Test Case\\Test_Case_Adactin_Hotel.xlsx", 1, 5);
		send_Keys(manager.getHotel().getUname(), email);				

		String pwd = particular_Cell_Data("D:\\Hamsa\\Testing\\Test Case\\Test_Case_Adactin_Hotel.xlsx", 2, 5);
		send_Keys(manager.getHotel().getPwd(), pwd);
	
		
		click_On_Element(manager.getHotel().getLogin());	

	}

    @Test
    private void location_London() throws IOException {

    	implicit_Wait(15);

    	String hotellocation = File_Reader_Manager.get_Instance_FRM().get_Instance_Reader().get_H_Location();
        select_Value(manager.getSearch_Hotel().getLocation(), hotellocation);				

        String hotelname = File_Reader_Manager.get_Instance_FRM().get_Instance_Reader().get_H_Name();
    	select_Value(manager.getSearch_Hotel().getHotel(), hotelname);

    	select_Value(manager.getSearch_Hotel().getRoom(), "Double");

		select_Value(manager.getSearch_Hotel().getRtype(), "10");
		
clear(manager.getSearch_Hotel().getDatein());

send_Keys(manager.getSearch_Hotel().getDatein(), "25/09/2022");

clear(manager.getSearch_Hotel().getDateout());

send_Keys(manager.getSearch_Hotel().getDateout(), "30/09/2022");

select_VisibleText(manager.getSearch_Hotel().getAroom(), "2 - Two");	    	    

select_Index(manager.getSearch_Hotel().getCroom(), 1);

click_On_Element(manager.getSearch_Hotel().getSubmit());
//////
click_On_Element(manager.getSelect_Hotel().getOkay());

click_On_Element(manager.getSelect_Hotel().getCont());
///////

send_Keys(manager.getBook_Hotel().getFname(), "AAA");

send_Keys(manager.getBook_Hotel().getLname(), "BBB");

send_Keys(manager.getBook_Hotel().getAdd(), "xyz");

send_Keys(manager.getBook_Hotel().getCard(), "1234123412341234");

select_Value(manager.getBook_Hotel().getCtype(), "VISA");

select_Index(manager.getBook_Hotel().getExp(), 10);

select_Value(manager.getBook_Hotel().getExp2(), "2022");

send_Keys(manager.getBook_Hotel().getCvv(), "234");

click_On_Element(manager.getBook_Hotel().getBooknow());

	}

    
@AfterMethod
private void logout_Method() {

	WebElement logout = driver.findElement(By.xpath("//input[@type='button' and @name='logout']"));
	click_On_Element(logout);
	
	WebElement login_again = driver.findElement(By.xpath("//a[text()='Click here to login again']"));
click_On_Element(login_again);

}

	
@Test(priority = -1, invocationCount = 2, description = "Second Method")
private void location_Sydney() throws InterruptedException {
	implicit_Wait(15);

	
	select_Value(manager.getSearch_Hotel().getLocation(), "Sydney");
	
	select_Value(manager.getSearch_Hotel().getHotel(), "Hotel Creek");
	
select_Value(manager.getSearch_Hotel().getRoom(), "Super Deluxe");
	
select_Index(manager.getSearch_Hotel().getRtype(), 3);

clear(manager.getSearch_Hotel().getDatein());
	
	send_Keys(manager.getSearch_Hotel().getDatein(), "01/10/2022");
	
	clear(manager.getSearch_Hotel().getDateout());
	
	send_Keys(manager.getSearch_Hotel().getDateout(), "05/10/2022");

	select_Index(manager.getSearch_Hotel().getAroom(), 2);
	
	select_Index(manager.getSearch_Hotel().getCroom(), 2);

	click_On_Element(manager.getSearch_Hotel().getSubmit());
	////
Thread.sleep(5000);
	click_On_Element(manager.getSelect_Hotel().getOkay());
	
click_On_Element(manager.getSelect_Hotel().getCont());
/////
send_Keys(manager.getBook_Hotel().getFname(), "CCC");
	
	send_Keys(manager.getBook_Hotel().getLname(), "DDD");
	
	send_Keys(manager.getBook_Hotel().getAdd(), "yyy");
	
	send_Keys(manager.getBook_Hotel().getCard(), "7831123412341234");
	
	

	select_Value(manager.getBook_Hotel().getCtype(), "VISA");

	select_Index(manager.getBook_Hotel().getExp(), 11);

	select_Value(manager.getBook_Hotel().getExp2(), "2022");

	send_Keys(manager.getBook_Hotel().getCvv(), "456");

	click_On_Element(manager.getBook_Hotel().getBooknow());

}



}



