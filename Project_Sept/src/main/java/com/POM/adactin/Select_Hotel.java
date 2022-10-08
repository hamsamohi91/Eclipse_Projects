package com.POM.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement okay;
	
	@FindBy(name = "continue")
	private WebElement cont;

	public Select_Hotel(WebDriver driver) {

	this.driver = driver;
	
	PageFactory.initElements(driver, this);
	}

	public WebElement getOkay() {
		return okay;
	}

	public WebElement getCont() {
		return cont;
	}
	
	
}
