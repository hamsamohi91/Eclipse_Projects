package com.POM.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement pwd;
	
	@FindBy(xpath = "(//button//parent::span)[3]")
	private WebElement signin;



	public Login(WebDriver driver2) {

	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSignin() {
		return signin;
	}
	
	
	
}
