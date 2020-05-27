package Listeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {
static WebDriver driver;
	public static void Initialization()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/?hl=en-US");
		
	}
	
	
	public void failed(String testMethodName)
	{
		Date d = new Date();
		String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		try {
			FileHandler.copy(src, new File("C:\\Users\\samsung\\eclipse-workspace\\Selenium_testng_parameterization_xml\\screenshot"
		+ testMethodName + "-"  +  ".png" + FileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
 
		
 
		
	}
}
