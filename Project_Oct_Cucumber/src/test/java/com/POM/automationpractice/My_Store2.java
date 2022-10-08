package com.POM.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Store2 {

	public WebDriver driver;
	
	@FindBy(xpath = "//span[.='I confirm my order']")
	private WebElement confrim;

	public My_Store2(WebDriver driver2) {

	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
	}

	public WebElement getConfrim() {
		return confrim;
	}

	
	

	
	
}
