package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("hamsa.mohiden");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123456");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	}
	
}
