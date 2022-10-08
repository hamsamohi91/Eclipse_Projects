package com.selenium.training2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dummy {

public static void main(String[] args) {
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");


	WebDriver driver = new ChromeDriver();

	driver.get("https://www.google.co.in/");
	
WebElement ser = driver.findElement(By.xpath("//div//following::input[@class='gLFyf gsfi']"));
ser.sendKeys(Integer.toString(34));


}
}


