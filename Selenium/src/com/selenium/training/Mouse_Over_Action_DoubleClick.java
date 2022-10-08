package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over_Action_DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

	WebDriver	driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");
	
		Thread.sleep(3000);
		
		//<Due to permission problem, i have used these elements>
	
		WebElement adv = driver.findElement(By.id("details-button"));
		adv.click();
		
		WebElement safe = driver.findElement(By.id("proceed-link"));
		safe.click();
		//</Due to permission problem, i have used these elements>

		
		Actions ac = new Actions(driver);
		
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		
		ac.doubleClick(doubleclick).build().perform();
		
		
	}	
}
