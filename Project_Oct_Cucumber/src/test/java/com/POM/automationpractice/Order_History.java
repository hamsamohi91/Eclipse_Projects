package com.POM.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_History {

	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement signouta;

	public Order_History(WebDriver driver) {

	this.driver = driver;
	
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getSignouta() {
		return signouta;
	}
	
	
	
	
	
	
	
}
