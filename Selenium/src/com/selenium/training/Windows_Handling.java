package com.selenium.training;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	//single-window
	public static WebDriver driver;
	
	public static void single_Window_Handling() throws AWTException, InterruptedException {
	
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

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

	
	String parent_Id = driver.getWindowHandle();
	
	Set<String> all_ID = driver.getWindowHandles();

//conversion of Set to List to switch the driver to second tab (by passing index)
	//(0 means First tab, 1 means Second tab)
	
//	List<String> list = new ArrayList<String>(all_ID);
//	
//	String window2 = list.get(1);
//	
//	driver.switchTo().window(window2);
	
	for (String id : all_ID) {
		
		if (id.equals(parent_Id)) {
			
			continue;
		}
		
		else {
	
driver.switchTo().window(id);

System.out.println("URL: "+driver.getCurrentUrl());
System.out.println("Title: "+driver.getTitle());


		}

	}
	}
	
//multiple-windows
	
	public static void multiple_Window_Handling() throws AWTException {
		
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

//Books
		WebElement books = driver.findElement(By.xpath("//a[@class='nav-a  ' and @data-csa-c-content-id='nav_cs_books']"));
		
		ac.contextClick(books).build().perform();
		
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);

		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);

		//Books
		
		
		Set<String> ids = driver.getWindowHandles();

//		for (String all : ids) {
//			System.out.println(driver.switchTo().window(all).getTitle());
//		}
		

		
		String expected_Title = "Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
	
		for (String all2 : ids) {
			
			if (driver.switchTo().window(all2).getTitle().equals(expected_Title)) {
				System.out.println(driver.getCurrentUrl());
				break;
			}
		}
		
                            // (or)		
		
		
//	List<String> list = new ArrayList<String>(ids);
//	
//	String thirdTab = list.get(3);
//	
//		driver.switchTo().window(thirdTab);
//		
//System.out.println(driver.getCurrentUrl());		
		
	}
	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		
	//single window handling
		
//		single_Window_Handling();
		
	//Multiple window handling
		
		multiple_Window_Handling();
	}
}
