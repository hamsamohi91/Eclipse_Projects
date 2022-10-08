package com.POM.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account {

	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	
	
@FindBy(xpath = "(//a[@title='Casual Dresses'])[2]")
private WebElement casual;





public My_Account(WebDriver driver2) {

	this.driver=driver2;

PageFactory.initElements(driver, this);
}


public WebElement getDresses() {
	return dresses;
}


public WebElement getCasual() {
	return casual;
}


//Second order



@FindBy(xpath = "(//a[@class='sf-with-ul'])[4]")
private WebElement dresses2;

@FindBy(xpath = "(//a[@title='Evening Dresses'])[2]")
private WebElement evening;





public WebElement getDresses2() {
	return dresses2;
}


public WebElement getEvening() {
	return evening;
}

	
}
