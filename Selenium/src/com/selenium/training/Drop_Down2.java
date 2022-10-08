package com.selenium.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//letcode website with multiple select option

public class Drop_Down2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://letcode.in/dropdowns");
	Thread.sleep(2000);
	driver.manage().window().maximize();

	WebElement apple = driver.findElement(By.id("fruits"));
	
	Select s = new Select(apple);
	
	s.selectByVisibleText("Apple");
	
	WebElement heros = driver.findElement(By.id("superheros"));
	
	
	Select s1 = new Select(heros);
	
	
if (s1.isMultiple()) {//to select multiple values in drop down
	s1.selectByValue("bp");
	s1.selectByVisibleText("Captain America");
	s1.selectByValue("ff");
}	
System.out.println("List of First Selected Hero:");

WebElement firstSelectedOption2 = s1.getFirstSelectedOption();
System.out.println(firstSelectedOption2.getText());

List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
System.out.println("List of Selected Heroes:");
for (WebElement allsel : allSelectedOptions) {
	System.out.println(allsel.getText());
}

//(or using for loop)
//List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
//
//for (int i = 0; i < allSelectedOptions.size() ; i++) {
//	System.out.println(allSelectedOptions.get(i).getText());
//}

Thread.sleep(2000);
	
WebElement lang = driver.findElement(By.id("lang"));	
	
	Select s2 = new Select(lang);
	
	s2.selectByValue("java");
	
	List<WebElement> options = s2.getOptions();
	System.out.println();
	System.out.println("All Languages:");
	for (WebElement all : options) {
		System.out.println(all.getText());
	}
	
	WebElement coun = driver.findElement(By.id("country"));
	
	Select s3 = new Select(coun);
	
	s3.selectByVisibleText("India");
	
	WebElement firstSelectedOption = s3.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	
}
}
