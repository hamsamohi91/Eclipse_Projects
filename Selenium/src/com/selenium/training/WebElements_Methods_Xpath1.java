package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods_Xpath1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2F%3Frd%3D0%26link%3Dhome_account");
//xpath using index
		WebElement username = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));//using index based
		username.sendKeys("8939665158");

		WebElement pass = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		pass.sendKeys("12345678");
//xpath using contains (partial) 
		WebElement login = driver.findElement(By.xpath("(//button[contains(@class, '_2KpZ6l')])[1]"));//using partial text
		login.click();
//xpath using text()
		WebElement forgot = driver.findElement(By.xpath("//span[text()='Forgot?']"));
		forgot.click();
//xpath using contains and text()		
		WebElement newsignup = driver.findElement(By.xpath("//span[contains(text(), 'Resend')]"));
		newsignup.click();

	
	
	
	}

}


