package com.selenium.training2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_MultipleValue {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://letcode.in/dropdowns");
	Thread.sleep(2000);
	driver.manage().window().maximize();

	
	WebElement heroes = driver.findElement(By.id("superheros"));
	
	Select s1 = new Select(heroes);
	
	if (s1.isMultiple()) {//to select multiple values in drop down
		
		s1.selectByValue("am");
		s1.selectByValue("aq");
		s1.selectByValue("ta");
	}
	
	WebElement firstSelectedOption = s1.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());//to return the first selected values
	
	List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
//to return the all selected values
for (WebElement all : allSelectedOptions) {
	System.out.println(all.getText());
}

}
}
