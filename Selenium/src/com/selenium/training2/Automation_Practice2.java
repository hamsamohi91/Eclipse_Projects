package com.selenium.training2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_Practice2 {

	public static WebDriver driver;
	
public static void order() throws IOException {

	driver.get("http://automationpractice.com/index.php?controller=order&step=1");

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
WebElement signup = driver.findElement(By.xpath("//a[@class='login']"));
signup.click();

WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
email.sendKeys("autopract@gmail.com");

WebElement pwd = driver.findElement(By.xpath("//input[@id='passwd']"));
pwd.sendKeys("Automation");

WebElement signin = driver.findElement(By.xpath("(//button//parent::span)[3]"));
signin.click();


Actions ac = new Actions(driver);
	
	WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	ac.moveToElement(dresses).build().perform();
	
	WebElement casual = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
	ac.moveToElement(casual).build().perform();
	
	ac.click().build().perform();
	
	
	WebElement dress1 = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
	dress1.click();
	
WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
driver.switchTo().frame(frame);	



	WebElement q = driver.findElement(By.xpath("//i[@class='icon-plus']"));

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	
	WebElement q2 = wait.until(ExpectedConditions.visibilityOf(q));
	
	q2.click();

WebElement size = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));


 
Select ss = new Select(size);

ss.selectByValue("2");

	WebElement add2cart = driver.findElement(By.xpath("//span[.='Add to cart']"));
	add2cart.click();
	
	WebElement proceed = driver.findElement(By.xpath("//span[normalize-space(.)='Proceed to checkout']"));
	proceed.click();
	
	WebElement p2check = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
	p2check.click();

WebElement p2check2 = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
p2check2.click();

WebElement agree = driver.findElement(By.xpath("//input[@type='checkbox']"));
agree.click();

WebElement p2check3 = driver.findElement(By.xpath("(//span[normalize-space(.)='Proceed to checkout'])[2]"));
p2check3.click();

WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
bank.click();

WebElement conf = driver.findElement(By.xpath("//span[.='I confirm my order']"));
conf.click();

WebElement back2order = driver.findElement(By.xpath("//a[@title='Back to orders']"));
back2order.click();

TakesScreenshot ts = (TakesScreenshot) driver;

File source = ts.getScreenshotAs(OutputType.FILE);

File dest = new File("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Screenshot\\s1.png");

FileUtils.copyFile(source, dest);

//Second Order

WebElement dresses2 = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]"));
ac.moveToElement(dresses2).build().perform();

WebElement evedress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
ac.moveToElement(evedress).click().build().perform();

WebElement clickdres = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
clickdres.click();

WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
driver.switchTo().frame(frame2);	

WebElement count2 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
ac.doubleClick(count2).build().perform();;

WebElement size2 = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));

Select s1 = new Select(size2);

s1.selectByValue("3");

WebElement color2 = driver.findElement(By.name("Pink"));
color2.click();

WebElement add2car2 = driver.findElement(By.xpath("//span[.='Add to cart']"));
add2car2.click();

WebElement checkout1 = driver.findElement(By.xpath("//span[normalize-space(.)='Proceed to checkout']"));
checkout1.click();

WebElement checkout2 = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
checkout2.click();

WebElement checkout3 = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
checkout3.click();

WebElement agree2 = driver.findElement(By.name("cgv"));
agree2.click();

WebElement checkout4 = driver.findElement(By.xpath("(//span[normalize-space(.)='Proceed to checkout'])[2]"));
checkout4.click();

WebElement cheque = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
cheque.click();

WebElement conf2 = driver.findElement(By.xpath("//span[.='I confirm my order']"));
conf2.click();

WebElement bac2ord = driver.findElement(By.xpath("//a[@title='Back to orders']"));
bac2ord.click();


File source2 = ts.getScreenshotAs(OutputType.FILE);

File dest2 = new File("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Screenshot\\s2.png");

FileUtils.copyFile(source2, dest2);

WebElement signout = driver.findElement(By.xpath("//a[@title='Log me out']"));
signout.click();

}
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		
		
		
		order();
		
	}
	
	
}
