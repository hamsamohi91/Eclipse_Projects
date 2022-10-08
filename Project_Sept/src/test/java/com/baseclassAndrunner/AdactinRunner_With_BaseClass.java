package com.baseclassAndrunner;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.POM.adactin.Book_A_Hotel;
import com.POM.adactin.Hotel_Booking_Confirmation;
import com.POM.adactin.Hotel_Reservation_System;
import com.POM.adactin.Search_Hotel;
import com.POM.adactin.Select_Hotel;
import com.logger.Property_Config;
import com.object.manager.Project_Object_Manager_Adactin;
import com.singleton.pattern.File_Reader_Manager;
import com.utility.Utility_Files;

public class AdactinRunner_With_BaseClass extends Utility_Files{

	
	public static WebDriver driver = Utility_Files.get_Browser("chrome");
	
//	public static Hotel_Reservation_System hotel = new Hotel_Reservation_System(driver);
//	public static Search_Hotel search_Hotel = new Search_Hotel(driver);
//	public static 	Select_Hotel select_Hotel = new Select_Hotel(driver);
//	public static Book_A_Hotel book_Hotel = new Book_A_Hotel(driver);
//    public static	Hotel_Booking_Confirmation confirmation = new Hotel_Booking_Confirmation(driver);

//                         ==

	public static Project_Object_Manager_Adactin manager = new Project_Object_Manager_Adactin(driver);	
    
public static Logger log = Logger.getLogger(Property_Config.class);//Logger
    
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		//Singleton Design Pattern
		String url = File_Reader_Manager.get_Instance_FRM().get_Instance_Reader().get_Url();		
        get(url);
       //</Singleton Design Pattern>
        

PropertyConfigurator.configure("log4j.properties");//Logger
log.info("Browser Launched");	//Logger

		implicit_Wait(15);

		//<Data_Driven>
		String email = particular_Cell_Data("D:\\Hamsa\\Testing\\Test Case\\Test_Case_Adactin_Hotel.xlsx", 1, 5);
		send_Keys(manager.getHotel().getUname(), email);				

		String pwd = particular_Cell_Data("D:\\Hamsa\\Testing\\Test Case\\Test_Case_Adactin_Hotel.xlsx", 2, 5);
		send_Keys(manager.getHotel().getPwd(), pwd);
		//</Data_Driven>
		
	click_On_Element(manager.getHotel().getLogin());	
	
	//<Singleton Design Pattern>
	String hotellocation = File_Reader_Manager.get_Instance_FRM().get_Instance_Reader().get_H_Location();
    select_Value(manager.getSearch_Hotel().getLocation(), hotellocation);				

    String hotelname = File_Reader_Manager.get_Instance_FRM().get_Instance_Reader().get_H_Name();
	select_Value(manager.getSearch_Hotel().getHotel(), hotelname);
	//</Singleton Design Pattern>
	
select_Value(manager.getSearch_Hotel().getRoom(), "Double");

				select_Value(manager.getSearch_Hotel().getRtype(), "10");
				
clear(manager.getSearch_Hotel().getDatein());

send_Keys(manager.getSearch_Hotel().getDatein(), "25/09/2022");
		
clear(manager.getSearch_Hotel().getDateout());
	    
send_Keys(manager.getSearch_Hotel().getDateout(), "30/09/2022");

select_VisibleText(manager.getSearch_Hotel().getAroom(), "2 - Two");	    	    

		select_Index(manager.getSearch_Hotel().getCroom(), 1);
		
	    click_On_Element(manager.getSearch_Hotel().getSubmit());
//////////////
	    
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
	//////
//	//Search for new hotel

click_On_Element(manager.getConfirmation().getName());
////	
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

	click_On_Element(manager.getBook_Hotel().getMyitenary());
	
	}
}
