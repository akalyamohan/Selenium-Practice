package ExtentReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Base {

	public static WebDriver driver;
	public static WebDriver Initialization()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		return driver;
		
	}
}
