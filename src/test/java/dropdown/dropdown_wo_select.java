package dropdown;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropdown_wo_select {

	WebDriver driver;
	@BeforeMethod
	public void Invokebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://register.freecrm.com/register/");
		
	}
	
	@Test
	public void dropdown_test()
	{
		driver.findElement(By.className("field")).sendKeys("in");
		driver.findElement(By.name("phone")).sendKeys("123");
		}

				
				

	
}
