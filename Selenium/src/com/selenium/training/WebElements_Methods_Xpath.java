package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods_Xpath {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/login/");

WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		username.sendKeys("hamsa,mohideen");

WebElement pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pass.sendKeys("12345678876");

WebElement login = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		login.click();

	}

}
