package com.selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_Demo_ChromeNotifications {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

//Coding to disable Chrome notifications and to launch Incognito browser
		
		//It has to set before the WebDriver to control notifications in Chrome
		ChromeOptions option = new ChromeOptions();
	
//Below method is used to disable the notifications in Chrome 		
		option.addArguments("disable-notifications");
//Below method is used to launch the browser in Incognito mode
		option.addArguments("incognito");
//Below method is used to launch Headless Browser
		//option.setHeadless(true); or
		//option.addArguments("--headless");
		
		
		WebDriver driver = new ChromeDriver(option);
driver.get("https://www.irctc.co.in/nget/train-search");		
		
		
	}
	
}
