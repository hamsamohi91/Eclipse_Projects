package com.selenium.training2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");

	Thread.sleep(2000);

	driver.manage().window().maximize();
	//normalize-space function
	
	WebElement signup = driver.findElement(By.xpath("//a[normalize-space(text())='Sign in']"));
	signup.click();

WebElement email = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[1]"));
email.sendKeys("autopract@gmail.com");

Thread.sleep(2000);
WebElement create = driver.findElement(By.xpath("//i[@class='icon-user left']"));
create.click();

Thread.sleep(4000);

WebElement mr = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
mr.click();

WebElement fname = driver.findElement(By.xpath("(//input[contains(@class, 'is_required')])[1]"));
fname.sendKeys("AAA");

WebElement lname = driver.findElement(By.xpath("(//input[contains(@class, 'is_required')])[2]"));
lname.sendKeys("BBB");

WebElement pwd = driver.findElement(By.xpath("(//input[contains(@class, 'is_required')])[4]"));
pwd.sendKeys("Automation");

WebElement day = driver.findElement(By.id("days"));
Select s1 = new Select(day);
s1.selectByValue("20");

WebElement mon = driver.findElement(By.id("months"));
Select s2 = new Select(mon);
s2.selectByValue("1");

WebElement yr = driver.findElement(By.id("years"));
Select s3 = new Select(yr);
s3.selectByValue("1991");

//using 'and' operator with two attributes 
WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @name=\"newsletter\"]"));
checkbox.click();

WebElement company = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
company.sendKeys("ZZZ");

WebElement address = driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
address.sendKeys("YYY");

WebElement address2 = driver.findElement(By.xpath("(//input[@class='form-control'])[5]"));
address2.sendKeys("XXX");

WebElement city = driver.findElement(By.xpath("(//input[@class='form-control'])[6]"));
city.sendKeys("New York");

WebElement state = driver.findElement(By.id("id_state"));
Select s4 = new Select(state);
s4.selectByValue("32");

WebElement postcode = driver.findElement(By.name("postcode"));
postcode.sendKeys("00000");

WebElement info = driver.findElement(By.xpath("//textarea[@class='form-control']"));
info.sendKeys("Nothing");

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("12345678");

WebElement mobile = driver.findElement(By.name("phone_mobile"));
mobile.sendKeys("8888877777");

WebElement addd = driver.findElement(By.name("alias"));
addd.clear();
addd.sendKeys("SSSSSS");

WebElement register = driver.findElement(By.name("submitAccount"));
register.click();
}
}
