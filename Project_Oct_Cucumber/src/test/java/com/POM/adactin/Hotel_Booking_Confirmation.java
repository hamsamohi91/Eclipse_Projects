package com.POM.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Booking_Confirmation {

	public static WebDriver driver;
	
	@FindBy(name = "search_hotel")
	private WebElement name;

	public Hotel_Booking_Confirmation(WebDriver driver) {

	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	public WebElement getName() {
		return name;
	}
	
	
}
