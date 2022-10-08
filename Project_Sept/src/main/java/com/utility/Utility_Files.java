package com.utility;

import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility_Files {

	
	public static WebDriver driver;
	
public static String value;
	
	public static WebDriver get_Browser(String type) {

		if(type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			
			driver =  new ChromeDriver();
			
		}
//		
//		else if (type.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
		
//		driver =  new FirefoxDriver();
//		}
//		
//else if (type.equalsIgnoreCase("edge")) {
//		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\driver\\edgedriver.exe");
		
//	driver =  new EgdeDriver();
//			
//		}
//		
		driver.manage().window().maximize();

			
		return driver;
	}
	

	
	
	
public static void get(String url) {
		
		driver.get(url);
	}
	
	
public static String get_Title() {
	
String title = driver.getTitle();

return title;

}


public static void navigateTo(String value) {

	driver.navigate().to(value);
	
	
}

public static String get_CurrentUrl() {
String currentUrl = driver.getCurrentUrl();
return currentUrl;

}

public static void close() {

	driver.close();
}

public static void quit() {

	driver.quit();
}


public static void click_On_Element(WebElement element) {

	element.click();
	
}

public static void send_Keys(WebElement element, String value) {

	element.sendKeys(value);
	
}


public static void select_Value(WebElement element, 
		String value) {
	
	Select s = new Select(element);
	s.selectByValue(value);

	
}

public static void select_VisibleText(WebElement element, 
		String value) {
	
	Select s = new Select(element);
s.selectByVisibleText(value);	
	
}
		
public  static boolean select_isMultiple(WebElement element) {

	Select s = new Select(element);
	
	boolean multiple = s.isMultiple();
	
	return multiple;
}

public static void select_Index(WebElement element, int value) {
	
	Select s = new Select(element);
	s.selectByIndex(value);
}



public static String get_Text(WebElement element) {
	
	String text = element.getText();
	return text;
}

public static void clear(WebElement element) {

	element.clear();
	
}

public static boolean is_Displayed(WebElement element) {

	boolean displayed = element.isDisplayed();
	return displayed;
}

public static boolean is_Enabled(WebElement element) {

	boolean enabled = element.isEnabled();
	return enabled;
}


public static boolean is_Selected(WebElement element) {

	boolean selected = element.isSelected();
	return selected;

}

public static void ScreenShot(String path) throws IOException {

	TakesScreenshot ts = (TakesScreenshot) driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File dest = new File(path);
	
	FileUtils.copyFile(source, dest);
	
}


public static void implicit_Wait(int s) {

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	
}

public static void Actions(WebElement value) {

	Actions ac = new Actions(driver);

	ac.moveToElement(value).build().perform();
}

public static void Actions_ContextClick(WebElement value) {
	Actions ac = new Actions(driver);
ac.contextClick(value).build().perform();
	
}

public static void Actions_DoubleClick(WebElement value) {
	Actions ac = new Actions(driver);
ac.doubleClick(value).build().perform();
	
}

public static void Frame_Method(WebElement value) {

	driver.switchTo().frame(value);
	
}

public static void frame_DefaultContent() {

	driver.switchTo().defaultContent();
}

public static void frame_Parent() {

	driver.switchTo().parentFrame();
}
public static void explicit_Visibility(WebElement value, int i) {


	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
	
	WebElement q2 = wait.until(ExpectedConditions.visibilityOf(value));
	
	q2.click();

}



public static String getAttribute(WebElement element, String value) {

	String attribute = element.getAttribute(value);
	return attribute;
}


public static String getTagName(WebElement element) {

	String tagName = element.getTagName();
	return tagName;
}

public static Point getLocation(WebElement element) {

	Point location = element.getLocation();
	
	return location;
	
}

public static Dimension getSize(WebElement element) {
	
	Dimension size = element.getSize();
	return size;
	
}



public static void get_Option(WebElement element) {

	Select s = new Select(element);
	
	List<WebElement> options = s.getOptions();
	
	for (WebElement all : options) {
		System.out.println(all.getText());
	}
}

public static void get_FirstSelectedOption(WebElement element) {

	Select s = new Select(element);
WebElement firstSelectedOption = s.getFirstSelectedOption();

System.out.println(firstSelectedOption.getText());

}

public static String particular_Cell_Data(String path, int row, int column) throws IOException {

	File file = new File(path);
	
	FileInputStream fis = new FileInputStream(file);
	
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet s = wb.getSheetAt(0);
	
	Row r = s.getRow(row);
	
	Cell c = r.getCell(column);
	
	CellType type = c.getCellType();
	
	if (type.equals(CellType.STRING)) {
		
		value = c.getStringCellValue();
	}
	else if(type.equals(CellType.NUMERIC)) {
	
		double d = c.getNumericCellValue();
		
		int a = (int) d;
		
		value = String.valueOf(a);
		
	}
	wb.close();

	return value;
	


	
}


 }

















































	
	
	
	

