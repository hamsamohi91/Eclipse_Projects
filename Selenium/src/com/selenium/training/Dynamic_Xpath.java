package com.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dynamic_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.xpath("//span[@id='username_span']//preceding-sibling::input"));
		username.clear();
		
		username.sendKeys("softtester");
		
		
		WebElement pwd = driver.findElement(By.xpath("//span[@id='username_span']//following::input[@type='password']"));
		pwd.clear();
		pwd.sendKeys("adc@123");
		
		WebElement login = driver.findElement(By.xpath("//td[@align='center']//preceding::input[@type='Submit']"));
		login.click();
		
		
		WebElement location = driver.findElement(By.xpath("//option[@value='Sydney']//parent::select"));
		Select s1 = new Select(location);
		s1.selectByValue("London");
		
		WebElement hotel = driver.findElement(By.xpath("//td//child::select[@name='hotels']"));
		Select s2 = new Select(hotel);
		s2.selectByValue("Hotel Hervey");
		
		WebElement roomt = driver.findElement(By.xpath("//tr//ancestor::select[@name='room_type']"));
		Select s3 = new Select(roomt);
		s3.selectByValue("Standard");
		
		WebElement roomn = driver.findElement(By.xpath("//option[@value='1']//parent::select[@name='room_nos']"));
		Select s4 = new Select(roomn);
		s4.selectByValue("4");
		
		WebElement datein = driver.findElement(By.xpath("//span[@id='checkin_span']//preceding-sibling::input[@name='datepick_in']"));
		datein.clear();
		datein.sendKeys("08/09/2022");
		
		WebElement dateout = driver.findElement(By.xpath("//td//child::input[@name=\"datepick_out\"]"));
		dateout.clear();
		dateout.sendKeys("15/09/2022");
		
		WebElement adult = driver.findElement(By.xpath("//td[@align='right']//following::select[@name='adult_room']"));
		Select s5 = new Select(adult);
		s5.selectByValue("1");

		WebElement child = driver.findElement(By.xpath("//span[@id='child_room_span']//preceding-sibling::select"));
		Select s6 = new Select(child);
		s6.selectByValue("1");
		
		WebElement search = driver.findElement(By.xpath("//input[@type='reset']//preceding-sibling::input"));
		search.click();
		
		WebElement sel = driver.findElement(By.xpath("//tr//descendant::input[@type='radio']"));
		sel.click();
		
		WebElement cont = driver.findElement(By.xpath("//td[@align='center']//child::input[@type='submit']"));
		cont.click();
		
		WebElement fname = driver.findElement(By.xpath("//tr//descendant::input[@name='first_name']"));
		fname.sendKeys("ABC");
		
	WebElement lname = driver.findElement(By.xpath("//label[@id='last_name_span']//preceding-sibling::input[@name='last_name']"));
	lname.sendKeys("EFG");
	
	WebElement address = driver.findElement(By.xpath("//td//child::textarea[@name='address']"));
	address.sendKeys("Chennai, Tamil Nadu");
	
	WebElement card = driver.findElement(By.xpath("//input[@name='cc_num' and @type='text']"));
	card.sendKeys("1234123412341234");
	
	WebElement ctype = driver.findElement(By.xpath("//td//descendant::select[@name='cc_type']"));
	Select s7 = new Select(ctype);
	s7.selectByValue("VISA");
	
	WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	Select s8 = new Select(month);
	s8.selectByValue("12");
	
	WebElement yr = driver.findElement(By.xpath("//select[@name='cc_exp_month']//following-sibling::select"));
	Select s9 = new Select(yr);
	s9.selectByValue("2022");
	
	WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	cvv.sendKeys("111");
	
	WebElement book = driver.findElement(By.xpath("//input[@type='button']//preceding-sibling::input"));
	book.click();
	
	WebElement logout = driver.findElement(By.xpath("//input[@type='button']//following-sibling::input[@name='logout']"));
	logout.click();
	
	}
	
	
}
