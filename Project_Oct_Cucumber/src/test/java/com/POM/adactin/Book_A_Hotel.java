package com.POM.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {

	public WebDriver driver;
	
	@FindBy(name = "first_name")
	private WebElement fname;
	
	@FindBy(name = "last_name")
	private WebElement lname;
	
	@FindBy(name = "address")
	private WebElement add;
	
	@FindBy(name = "cc_num")
	private WebElement card;
	
	@FindBy(name = "cc_type")
	private WebElement ctype;

	@FindBy(name = "cc_exp_month")
	private WebElement exp;

	@FindBy(name = "cc_exp_year")
	private WebElement exp2;
	
	@FindBy(name = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement booknow;

	@FindBy(xpath = "//input[@type='button' and @name='my_itinerary']")
	private WebElement myitenary;
	
	

	public Book_A_Hotel(WebDriver driver2) {

	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getExp() {
		return exp;
	}

	public WebElement getExp2() {
		return exp2;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	public WebElement getMyitenary() {
		return myitenary;
	}
	
}
