package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTables {
	
	static WebDriver driver;
	
	@BeforeTest
	public static void Initialization()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}
	
	////*[@id="product"]/tbody/tr[2]/td[2]
	@Test
	public void tables()
	{
		String beforexpath = "//*[@id=\"product\"]/tbody/tr[";
		String afterxpath ="]/td[2]";
		List<WebElement> rows =driver.findElements(By.xpath("//table[@id=\"product\"]/tbody/tr"));
		int rowscount = rows.size();
		System.out.println(rowscount);
		
		
		for(int i =2; i<=rowscount; i++)
		{
			String actualxpath=beforexpath+i+afterxpath;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			String names = element.getText();
			System.out.println(names);
			
		}
		
	}

}
