package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");

		//simple alert
		WebElement simplealert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simplealert.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		//alert with OK and Cancel
		WebElement okWithCancel = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		okWithCancel.click();
		
        WebElement alertwithok = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        alertwithok.click();

        Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();

//alert with promt value
		Thread.sleep(2000);
		
		WebElement alertwithtext = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		alertwithtext.click();
		
		WebElement promptbox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptbox.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Hamsa");
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();

	}

}
