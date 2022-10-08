package com.selenium.training;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		

System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.w3schools.com/html/html_tables.asp");
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//to get the table rows
System.out.println("**Table Rows**");		
List<WebElement> tabcontents = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr"));
		
		for (WebElement aa : tabcontents) {
			System.out.println(aa.getText());
		}
		
//to get the every table data without column head

		System.out.println("**Table Data**");		
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/td"));
		
		for (WebElement all : alldata) {
			System.out.println(all.getText());
		}
		
//to get the particular row
		System.out.println("**Table Particular Row**");		
		
		List<WebElement> row2 = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr[2]/td"));
		
		for (WebElement partrow : row2) {
			System.out.println(partrow.getText());
		}
		
//to get particular column
		System.out.println("**Table Particular Column**");		
		
		List<WebElement> partcol = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/td[2]"));
		for (int i = 0; i < partcol.size(); i++) {
			
			System.out.println(partcol.get(i).getText());
		}

//to get column head		
		System.out.println("**Table Column Head**");		

		List<WebElement> colhead = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/th"));
		for (WebElement chead : colhead) {
			System.out.println(chead.getText());
		}
		
//to get particular data in particular row
		
				System.out.println("**Table particular dat in particular row**");		
		
		List<WebElement> pardata = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr[4]/td"));
		
		for (int i = 0; i < pardata.size(); i++) {
					if (i==1) {
				continue;
			}
					System.out.println(pardata.get(i).getText());
					
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
