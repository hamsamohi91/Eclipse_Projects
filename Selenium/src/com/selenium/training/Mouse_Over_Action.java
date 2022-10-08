package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over_Action {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

	WebDriver	driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
	
	Actions ac = new Actions(driver);

	WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
	ac.moveToElement(women).build().perform();
	
	WebElement casual = driver.findElement(By.xpath("//a[text()='Casual Dresses'][1]"));
	ac.moveToElement(casual).build().perform();
	//or ac.moveToElement(casual).click().build().perform();
	
	ac.click().build().perform();//or ac.click(casual).build().perform();
	
	
	
	
	
	
	
	
	
	}
}
