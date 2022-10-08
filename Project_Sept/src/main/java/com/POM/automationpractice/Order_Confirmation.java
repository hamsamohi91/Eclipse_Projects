package com.POM.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Confirmation {

	public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement back2order;

	public Order_Confirmation(WebDriver driver) {

	this.driver = driver;
	
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getBack2order() {
	
		
		return back2order;
	}
	
	
	
}
