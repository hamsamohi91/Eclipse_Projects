package com.selenium.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo {

	public static WebDriver driver;
//<to find tagName and count>
	public static void countOfFrame() {

		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		System.out.println("Size: " + findElements.size());

		for (WebElement aa : findElements) {
			System.out.println(aa);//getText() check
		}
	}
	//</to find tagName and count>

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Frames.html");

//<Single_Frame>
		driver.switchTo().frame("singleframe");// or index frame(0)

		WebElement ftextbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		ftextbox.sendKeys("Good");

//</Single_Frame>

//to get out of frame

		driver.switchTo().defaultContent();

		Thread.sleep(2000);
//<Multiple_Frames>		

		WebElement sframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		sframe.click();

		// OuterFrame
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);

//InnerFrame
		WebElement innerframe = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(innerframe);

		WebElement stextbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		stextbox.sendKeys("Will");

//to move from inner to outer frame	
		driver.switchTo().parentFrame();

//to move out of all frames
		driver.switchTo().defaultContent();

//</Multiple_Frames>		

		Thread.sleep(3000);

		WebElement menu = driver.findElement(By.xpath("(//a[@href='SwitchTo.html'])[1]"));
		menu.click();

		countOfFrame();

	}
}
