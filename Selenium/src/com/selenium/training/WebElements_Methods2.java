package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods2 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://scholar.google.com/");
		driver.manage().window().maximize();

WebElement scholar = driver.findElement(By.id("gs_hdr"));
System.out.println(scholar.isDisplayed());

//isDisplayed
//boolean displayed = scholar.isDisplayed();//isDisplayed() method
//System.out.println(displayed);
//if (displayed) {
//	System.out.println("My result is passed");
//}

}
}
