package com.POM.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Dresses {

	public WebDriver driver;
	
	@FindBy(xpath = "//img[@title='Printed Dress']")
	private WebElement dress1;


	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement frame;
	
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement quantity;
	
	@FindBy(xpath = "//select[@class='form-control attribute_select no-print']")
	private WebElement size;

	
	
	@FindBy(xpath = "//span[.='Add to cart']")
	private WebElement add2cart;

	

	@FindBy(xpath = "//span[normalize-space(.)='Proceed to checkout']")
	private WebElement proceed;



	public Casual_Dresses(WebDriver driver) {

		this.driver=driver;
	
PageFactory.initElements(driver, this);
	}



	public WebElement getDress1() {
		return dress1;
	}



	public WebElement getFrame() {
		return frame;
	}



	public WebElement getQuantity() {
		return quantity;
	}



	public WebElement getSize() {
		return size;
	}



	public WebElement getAdd2cart() {
		return add2cart;
	}



	public WebElement getProceed() {
		return proceed;
	}
	

	
}
