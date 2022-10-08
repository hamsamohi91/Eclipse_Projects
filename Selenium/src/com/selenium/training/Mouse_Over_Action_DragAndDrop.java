package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over_Action_DragAndDrop {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

	WebDriver	driver = new ChromeDriver();

		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
	
		Thread.sleep(3000);
		
		//<Due to permission problem, i have used these elements>
		WebElement adv = driver.findElement(By.id("details-button"));
		adv.click();
		
		WebElement safe = driver.findElement(By.id("proceed-link"));
		safe.click();
		//</Due to permission problem, i have used these elements>
		
		Thread.sleep(2000);
			
	Actions ac = new Actions(driver);

	//to select the image location
	WebElement source = driver.findElement(By.id("form:drag_content"));
	
	Thread.sleep(2000);
	
	
	//to select the drop location
	WebElement dest = driver.findElement(By.id("form:drop_content"));
	
	
	//to move from source to destination
	ac.dragAndDrop(source, dest).build().perform();
	
	}
}
