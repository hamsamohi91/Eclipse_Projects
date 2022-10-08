package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Runner {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Project_Sept\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();

		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("softtester");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("adc@123");
		
		Thread.sleep(2000);
	WebElement login = driver.findElement(By.name("login"));	
	login.click();
		
		WebElement location = driver.findElement(By.name("location"));	
		Select s =new Select(location);
		s.selectByValue("London");
		
	    WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 =new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		
		WebElement room = driver.findElement(By.name("room_type"));	
		Select s2 =new Select(room);
		s2.selectByValue("Super Deluxe");
		
		WebElement rtype = driver.findElement(By.id("room_nos"));
		Select s3 =new Select(rtype);
		s3.selectByValue("10");
	Thread.sleep(1000);
		WebElement datein = driver.findElement(By.id("datepick_in"));	
		datein.clear();
	Thread.sleep(1000);
		datein.sendKeys("15/09/2022");
	Thread.sleep(2000);
	    WebElement dateout = driver.findElement(By.name("datepick_out"));	
	    dateout.clear();
	Thread.sleep(2000);
	    dateout.sendKeys("19/09/2022");
	Thread.sleep(1000);
	    WebElement aroom = driver.findElement(By.id("adult_room"));
		Select s4 =new Select(aroom);
		s4.selectByValue("4");
	Thread.sleep(1000);
		WebElement croom = driver.findElement(By.name("child_room"));	
		Select s5 =new Select(croom);
		s5.selectByValue("1");
	Thread.sleep(1000);    
	    WebElement submit = driver.findElement(By.name("Submit"));
	    submit.click();
	 Thread.sleep(1000); 
	WebElement okay = driver.findElement(By.xpath("//input[@type='radio']"));
	okay.click();

	Thread.sleep(2000);
	WebElement cont = driver.findElement(By.name("continue"));
	cont.click();

	Thread.sleep(1000); 
	WebElement fname = driver.findElement(By.name("first_name"));
	fname.sendKeys("AAA");
	Thread.sleep(1000); 
	WebElement lname = driver.findElement(By.name("last_name"));
	lname.sendKeys("BBB");
	Thread.sleep(1000); 
	WebElement add = driver.findElement(By.name("address"));
	add.sendKeys("xxx");
	Thread.sleep(1000); 
	WebElement card = driver.findElement(By.name("cc_num"));
	card.sendKeys("1234123412341234");
	Thread.sleep(1000); 
	WebElement ctype = driver.findElement(By.name("cc_type"));	
	Select s6 =new Select(ctype);
	s6.selectByValue("VISA");
	Thread.sleep(1000); 
	WebElement exp = driver.findElement(By.name("cc_exp_month"));	
	Select s7 =new Select(exp);
	s7.selectByValue("10");
	Thread.sleep(1000); 
	WebElement exp2 = driver.findElement(By.name("cc_exp_year"));	
	Select s8 =new Select(exp2);
	s8.selectByValue("2022");
	Thread.sleep(1000); 
	WebElement cvv = driver.findElement(By.name("cc_cvv"));
	cvv.sendKeys("123");

	WebElement booknow = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	booknow.click();

	//Search for new hotel

	Thread.sleep(5000);

	WebElement searchnew = driver.findElement(By.name("search_hotel"));
	searchnew.click();
	///***

	Thread.sleep(2000);

	WebElement location1 = driver.findElement(By.name("location"));	
	Select sa =new Select(location1);
	sa.selectByValue("Sydney");

	WebElement hotela = driver.findElement(By.id("hotels"));
	Select s1a =new Select(hotela);
	s1a.selectByValue("Hotel Creek");

	WebElement rooma = driver.findElement(By.name("room_type"));	
	Select s2a =new Select(rooma);
	s2a.selectByValue("Super Deluxe");

	WebElement rtypea = driver.findElement(By.id("room_nos"));
	Select s3a =new Select(rtypea);
	s3a.selectByValue("3");
	Thread.sleep(1000);
	WebElement dateina = driver.findElement(By.id("datepick_in"));	
	dateina.clear();
	Thread.sleep(1000);
	dateina.sendKeys("14/09/2022");
	Thread.sleep(2000);
	WebElement dateouta = driver.findElement(By.name("datepick_out"));	
	dateouta.clear();
	Thread.sleep(2000);
	dateouta.sendKeys("18/09/2022");
	Thread.sleep(1000);
	WebElement arooma = driver.findElement(By.id("adult_room"));
	Select s4a =new Select(arooma);
	s4a.selectByValue("2");
	Thread.sleep(1000);
	WebElement crooma = driver.findElement(By.name("child_room"));	
	Select s5a =new Select(crooma);
	s5a.selectByValue("2");
	Thread.sleep(1000);    
	WebElement submita = driver.findElement(By.name("Submit"));
	submita.click();
	Thread.sleep(1000); 
	WebElement okaya = driver.findElement(By.xpath("//input[@type='radio']"));
	okaya.click();

	Thread.sleep(2000);
	WebElement conta = driver.findElement(By.name("continue"));
	conta.click();

	Thread.sleep(1000); 
	WebElement fnamea = driver.findElement(By.name("first_name"));
	fnamea.sendKeys("CCC");
	Thread.sleep(1000); 
	WebElement lnamea = driver.findElement(By.name("last_name"));
	lnamea.sendKeys("DDD");
	Thread.sleep(1000); 
	WebElement adda = driver.findElement(By.name("address"));
	adda.sendKeys("yyy");
	Thread.sleep(1000); 
	WebElement carda = driver.findElement(By.name("cc_num"));
	carda.sendKeys("7831123412341234");
	Thread.sleep(1000); 
	WebElement ctypea = driver.findElement(By.name("cc_type"));	
	Select s6a =new Select(ctypea);
	s6a.selectByValue("VISA");
	Thread.sleep(1000); 
	WebElement expa = driver.findElement(By.name("cc_exp_month"));	
	Select s7a =new Select(expa);
	s7a.selectByValue("11");
	Thread.sleep(1000); 
	WebElement exp2a = driver.findElement(By.name("cc_exp_year"));	
	Select s8a =new Select(exp2a);
	s8a.selectByValue("2022");
	Thread.sleep(1000); 
	WebElement cvva = driver.findElement(By.name("cc_cvv"));
	cvva.sendKeys("456");
	Thread.sleep(5000);
	WebElement booknowa = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	booknowa.click();


	}

	
}
