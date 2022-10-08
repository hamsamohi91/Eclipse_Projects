package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods3 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://scholar.google.com/");
	//driver.manage().window().maximize();

WebElement search = driver.findElement(By.id("gs_hdr_tsi"));

search.sendKeys("Encylopedia");

//Attribute Name

String attribute = search.getAttribute("name");
System.out.println("Attribute name: "+attribute);

//Attribute Value

String attribute2 = search.getAttribute("value");
System.out.println("Attribute value: "+attribute2);
	
//Tagname

String tagName = search.getTagName();
System.out.println("Tag Name is: "+tagName);

//Location -- Point
Point location = search.getLocation();
System.out.println("Location is: "+location);

//Size - Dimension
Dimension size = search.getSize();
System.out.println("Size is: "+size);

//isEnabled

boolean enabled = search.isEnabled();
System.out.println("Enabled or not: " + enabled);

//isSelected
boolean selected = search.isSelected();
System.out.println("Selected or not: " + selected);

//getcssValue

WebElement search2 = driver.findElement(By.id("gs_hdr_tsi"));
String cssValue = search2.getCssValue("font-size");
System.out.println("CSS Value: "+cssValue);
}
}
