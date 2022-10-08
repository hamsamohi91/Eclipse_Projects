package com.selenium.training;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_Implicit_And_PageLoad {

	public static WebDriver driver;
	
	public static void implicitly_Wait() {

		driver.get("https://www.amazon.in/");

		//sel 3 ->	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//sel 4
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			
			WebElement ser = driver.findElement(By.xpath("//input[@type='text']"));
			ser.sendKeys("Redmi TV");
			
			WebElement sera = driver.findElement(By.xpath("//input[contains(@id,'nav-search')]"));
			sera.click();
			
			driver.navigate().to("https://www.flipkart.com/");

		WebElement mobile = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		mobile.sendKeys("8939665158");
	}
	
	
	
	public static void pageLoadWait() {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.facebook.com/login/");

		WebElement ser = driver.findElement(By.xpath("//input[@type='text']"));
		ser.sendKeys("8939665158");
		
	}
	
	public static void main(String[] args) {
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

	driver = new ChromeDriver();

		
	
//	implicitly_Wait();
	
	pageLoadWait();
	
	
	
	
	
}
}
