package com.selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.get("https://scholar.google.com/");
		
		driver.manage().window().fullscreen();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//System.out.println(driver.getTitle());
		
		String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);

driver.navigate().to("https://www.facebook.com/login/");

driver.navigate().to("https://www.amazon.in/");

driver.navigate().to("https://www.flipkart.com/");

driver.navigate().to("https://www.meesho.com/");

driver.navigate().back();

driver.navigate().forward();

driver.navigate().refresh();

driver.close();

	}
}
