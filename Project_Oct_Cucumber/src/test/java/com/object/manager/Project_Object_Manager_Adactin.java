package com.object.manager;

import org.openqa.selenium.WebDriver;

import com.POM.adactin.Book_A_Hotel;
import com.POM.adactin.Hotel_Booking_Confirmation;
import com.POM.adactin.Hotel_Reservation_System;
import com.POM.adactin.Search_Hotel;
import com.POM.adactin.Select_Hotel;

public class Project_Object_Manager_Adactin {
	
	public WebDriver driver;

private Hotel_Reservation_System hotel;	
	
private Search_Hotel search_Hotel;
	
private Select_Hotel select_Hotel;

private Book_A_Hotel book_Hotel;

private Hotel_Booking_Confirmation confirmation;


public Project_Object_Manager_Adactin(WebDriver driver2) {

this.driver = driver2; 
}

public Hotel_Reservation_System getHotel() {
if(hotel==null) {
	hotel = new Hotel_Reservation_System(driver);
}
	return hotel;
}

public Search_Hotel getSearch_Hotel() {
	if(search_Hotel==null) {
	search_Hotel = new Search_Hotel(driver);
	}
	return search_Hotel;
}

public Select_Hotel getSelect_Hotel() {
	if(select_Hotel==null) {
	select_Hotel = new Select_Hotel(driver);
	}
	return select_Hotel;
}

public Book_A_Hotel getBook_Hotel() {
	if(book_Hotel==null) {
	book_Hotel = new Book_A_Hotel(driver);
	}
	return book_Hotel;
}

public Hotel_Booking_Confirmation getConfirmation() {
	if(confirmation==null) {
	confirmation = new Hotel_Booking_Confirmation(driver);
	}
	return confirmation;
}








}
