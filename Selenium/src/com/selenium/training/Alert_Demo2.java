package com.selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//Authentication Alert/Pop-up
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(3000);
		
		//Here, We have to give username and pwd to authenticate this site
		//In below example:
		//Username:admin
		//pwd:admin
		//is given within the URL to authenticate the webpage
		
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
	}
	
	
	
	
}
