package com.selenium.training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Explicit {

	public static WebDriver driver;

	public static void alert_Is_Present() {

		driver.get("https://letcode.in/waits");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement simplealert = driver.findElement(By.xpath("//button[@id='accept']"));
		simplealert.click();

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
	}

	
	
	public static void visible_Condition() {
	
	driver.get("https://letcode.in/signin");
	
	WebElement username = driver.findElement(By.xpath("(//input[@placeholder='Enter registered email'])[1]"));
	username.sendKeys("aaa");
	
	WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
	pwd.sendKeys("123");
	
	WebElement login = driver.findElement(By.xpath("//button[.='LOGIN']"));
	login.click();
	
	//to wait till the sweat alert to go
	
	WebElement toast = driver.findElement(By.id("toast-container"));
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	wait.until(ExpectedConditions.invisibilityOf(toast));
	
	
	WebElement signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
	
	//to wait till the visibility of sign up button
	
	WebElement a = wait.until(ExpectedConditions.visibilityOf(signup));
	
	a.click();
	
	}
	
	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		alert_Is_Present();
		//visible_Condition();
		
	}
}
