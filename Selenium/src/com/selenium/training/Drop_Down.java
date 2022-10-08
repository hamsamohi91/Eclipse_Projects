package com.selenium.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	create.click();
	
	Thread.sleep(2000);

	WebElement date = driver.findElement(By.id("day"));
	
	Thread.sleep(2000);

	Select s = new Select(date);
	
	boolean ismultiple = s.isMultiple();//to check whether the drop-down is multiple or single select
	System.out.println(ismultiple);
	
	s.selectByValue("20");

WebElement month = driver.findElement(By.name("birthday_month"));

Thread.sleep(2000);

Select s1 =new Select(month);

List<WebElement> options = s1.getOptions();//it will return all the element present in the drop-down

for (WebElement aa : options) {
	System.out.println(aa.getText());//getText() method id mandatory to return the web element
}


s1.selectByVisibleText("Jan");

WebElement yr = driver.findElement(By.id("year"));
Thread.sleep(2000);

Select s2 =new Select(yr);

s2.selectByValue("1991");
s2.selectByValue("1990");//override the value

WebElement firstSelectedOption = s2.getFirstSelectedOption();//it will return the finally assinged
                                                             //value in the drop down   

System.out.println(firstSelectedOption.getText());

WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
gender.click();
}



}
