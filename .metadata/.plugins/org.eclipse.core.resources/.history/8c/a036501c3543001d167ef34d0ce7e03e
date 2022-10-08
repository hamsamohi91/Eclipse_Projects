package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.utility.Utility_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\Feature\\Adactin.feature", glue = "com.stepdef",
                  monochrome = true, dryRun = false, publish = true,
                  tags = "@Ad1", 
          //"~@Ad1" //{"@Ad1", "@Ad2"} --> info
                  //"not @Ad1" ---> IO
                  
                  plugin =  {
                		  
                		  "html:Reports/AdactionReport.html", 
              //  		  "pretty",
                //		  "json:Reports/AdactinRep.json"
                		  
                  }
		)
public class Adactin_Runner {

	public static WebDriver driver;
	

	
	
	
	@BeforeClass
	public static void set_Up() {

		driver = Utility_Files.get_Browser("chrome");

		
		
		
		
	}
	
	@AfterClass
	public static void tear_Down() {

		driver.close();
		
		
	}
}
