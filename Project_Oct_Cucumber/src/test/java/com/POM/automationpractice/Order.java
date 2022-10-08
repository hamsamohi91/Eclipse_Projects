package com.POM.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
public WebDriver driver;
	
	@FindBy(xpath = "//span[.='Proceed to checkout']")
	private WebElement p2check;
	
	@FindBy(xpath = "//span[.='Proceed to checkout']")
	private WebElement p2check2;
	
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement agree;
	
	@FindBy(xpath = "(//span[normalize-space(.)='Proceed to checkout'])[2]")
	private WebElement p2check3;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bank;

	@FindBy(name = "cgv")
	private WebElement agree2;
	
	@FindBy(xpath = "(//span[normalize-space(.)='Proceed to checkout'])[2]")
	private WebElement checkout4;

	
	
	@FindBy(xpath = "//a[@title='Pay by check.']")
	private WebElement cheque;
	
	
	public WebElement getAgree2() {
		return agree2;
	}

	public WebElement getCheckout4() {
		return checkout4;
	}

	public WebElement getCheque() {
		return cheque;
	}

	public Order(WebDriver driver2) {

	this.driver= driver2;
	
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getP2check() {
		return p2check;
	}

	public WebElement getP2check2() {
		return p2check2;
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getP2check3() {
		return p2check3;
	}

	public WebElement getBank() {
		return bank;
	}
	
	
	
}
