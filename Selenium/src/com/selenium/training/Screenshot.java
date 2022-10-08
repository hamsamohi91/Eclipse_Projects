package com.selenium.training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.get("file:///C:/Users/welcome/Desktop/40%20inch%20tv.html");

		//to take screenshot
		TakesScreenshot sc = (TakesScreenshot) driver;//narrowing or downcasting
		//below command will store ss in jvm
		File source = sc.getScreenshotAs(OutputType.FILE);
		//below command will store ss in location
		File destination = new File("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Screenshot\\tv.png");
//we must give file name and extension as "\\tv.png"
		//to copy ss from jvm to location
		FileUtils.copyFile(source, destination);
		
		
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(5000);
		File source2 = sc.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Screenshot\\flip.jpg");
		FileUtils.copyFile(source2, destination2);
	
	}
	
}
