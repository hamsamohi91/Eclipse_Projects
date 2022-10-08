package com.selenium.training2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_A {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		// WebDriver driver = new ChromeDriver(); UpCasting
		ChromeDriver driver = new ChromeDriver();// since ChromeDriver is a child class of WebDriver, we can directly
													// call ChromeDriver but it will also invoke childclass own methods
//gmail account create
		driver.get(
				"https://www.google.com/search?q=gmail+create&oq=gmail&aqs=chrome.2.69i57j0i131i433i512j0i433i512l3j0i131i433i512j69i65j69i61.4670j0j7&sourceid=chrome&ie=UTF-8");

//		driver.get(
//				"https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement create = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[2]"));
		create.click();
		Thread.sleep(2000);

		WebElement myself = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
		myself.click();

		Thread.sleep(9000);
		
		WebElement firstname = driver.findElement(By.name("Passwd"));
		
		firstname.sendKeys("Hamsa");
	}

}
