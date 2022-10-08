package com.POM.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Reservation_System {

	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement uname;
	
	@FindBy(id = "password")
	private WebElement pwd;
	
	@FindBy(name = "login")
	private WebElement login;

	public Hotel_Reservation_System(WebDriver driver) {

	this.driver = driver;
	
	PageFactory.initElements(driver, this);
	}

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
}
