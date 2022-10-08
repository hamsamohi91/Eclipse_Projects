package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over_Action_RightClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

	WebDriver	driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
	
	Actions ac = new Actions(driver);

//to right click on Web page
	
//	Thread.sleep(2000);
//	ac.contextClick().build().perform();
	
	
//to right click on Web page Element
	Thread.sleep(2000);
	
	WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
	Thread.sleep(2000);
	ac.contextClick(images).build().perform();
	
	}	
}
