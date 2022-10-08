package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Demo {

	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
	driver = new ChromeDriver();	
		
	driver.get("https://www.facebook.com/");

	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;//downcasting
	
	WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
	
//	WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		
//	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	
	WebElement signin = driver.findElement(By.xpath("//a[.='Sign Up']"));
	
	
	
	//to send keys
	
	js.executeScript("arguments[0].value='Hamsa.mohideen'", mail);
	
	Thread.sleep(3000);
	
	//To Highlight
	
	js.executeScript("arguments[0].setAttribute('style', 'color: red')", mail);
	
	Thread.sleep(3000);

	

	//To Scroll
	
    js.executeScript("arguments[0].scrollIntoView()", signin);	

    
  //To Click
	
	js.executeScript("arguments[0].click()", signin);

    
	}
	
}
