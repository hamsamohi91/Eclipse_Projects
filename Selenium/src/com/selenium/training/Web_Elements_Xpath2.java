package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements_Xpath2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting

		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();

		// Starts-with (its like contains function)

		WebElement username = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Email address or')]"));

		username.sendKeys("hamsa.mohideen");

		WebElement pwd = driver.findElement(By.xpath("(//input[starts-with(@class, 'inputtext _')])[2]"));
		pwd.sendKeys("12334455");

	}

}
