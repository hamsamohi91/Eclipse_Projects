package com.POM.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

public static WebDriver driver;	
	@FindBy(name = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(name  = "room_type")
	private WebElement room;

	@FindBy(id  = "room_nos")
	private WebElement rtype;

	@FindBy(id  = "datepick_in")
	private WebElement datein;
	
	@FindBy(name  = "datepick_out")
	private WebElement dateout;
	
	@FindBy(id  = "adult_room")
	private WebElement aroom;
	
	@FindBy(name  = "child_room")
	private WebElement croom;
	
	@FindBy(name  = "Submit")
	private WebElement submit;

	public Search_Hotel(WebDriver driver) {

		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		}

	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRtype() {
		return rtype;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAroom() {
		return aroom;
	}

	public WebElement getCroom() {
		return croom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	

	
}
