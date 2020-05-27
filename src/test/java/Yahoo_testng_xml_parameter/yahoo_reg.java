package Yahoo_testng_xml_parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class yahoo_reg {
	WebDriver driver;
	@BeforeMethod
	public void Invokebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?.intl=ca&.lang=en-CA&.done=https%3A%2F%2Fca.yahoo.com&src=fpctx&specId=yidReg");
		
	}
	
	@Test
	@Parameters({"firstname","lastname","userid","password"})
	public void Yahoo_reg_test(String firstname, String lastname, String userid, String password)
	{
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("lastName")).sendKeys(lastname);
		driver.findElement(By.name("yid")).sendKeys(userid);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
