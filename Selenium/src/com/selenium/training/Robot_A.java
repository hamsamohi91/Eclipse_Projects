package com.selenium.training;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_A {

	public static WebDriver driver;
	
	
	public static void robot() throws AWTException {

		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement gmail = driver.findElement(By.xpath("//a[@class='gb_d' and .='Gmail']"));
		
		Actions a = new Actions(driver);
		
		a.contextClick(gmail).build().perform();
		
		
Robot r = new Robot();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

	}
	
	
public static void robot_2() throws AWTException {

	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	Actions ac = new Actions(driver); 

	
	//mobiles
	
	WebElement mobiles = driver.findElement(By.xpath("//a//following::a[text()='Mobiles']"));
		
	ac.contextClick(mobiles).build().perform();
	
	Robot rt = new Robot();
	
	rt.keyPress(KeyEvent.VK_DOWN);
    rt.keyRelease(KeyEvent.VK_DOWN);

rt.keyPress(KeyEvent.VK_ENTER);
rt.keyRelease(KeyEvent.VK_ENTER);
//mobiles

//BestSellers

WebElement bestSell = driver.findElement(By.xpath("//a[.='Mobiles']//preceding::a[text()='Best Sellers']"));

ac.contextClick(bestSell).build().perform();

rt.keyPress(KeyEvent.VK_DOWN);
rt.keyRelease(KeyEvent.VK_DOWN);

rt.keyPress(KeyEvent.VK_ENTER);
rt.keyRelease(KeyEvent.VK_ENTER);

//BestSellers







}	
	
	
	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
			
//		robot();
		robot_2();
	}
}
