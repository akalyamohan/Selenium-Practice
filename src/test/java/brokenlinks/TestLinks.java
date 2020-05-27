package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLinks {
	WebDriver driver;
	@BeforeMethod
	public void Invokebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://makemysushi.com/Recipes/how-to-make-sushi-rice");
		
	}
	
	@Test
	public void Link_validation() throws MalformedURLException, IOException
	{
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		int linklist_count = linklist.size();
		System.out.println(linklist_count);
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		for(int i =0; i<linklist_count; i++)
		{
			System.out.println(linklist.get(i).getAttribute("href"));
		linklist.get(i).getAttribute("href");
			if(linklist.get(i).getAttribute("href")!= null && (linklist.get(i).getAttribute("href").contains("sun")))
			{
				activelinks.add(linklist.get(i));
			}
		}
		int activelinks_count = activelinks.size();
		for(int j=0; j<activelinks_count;j++)
		{
			HttpURLConnection connection = (HttpURLConnection)(new URL(activelinks.get(j).getAttribute("href")).openConnection());
            
            connection.connect();
            
           String response = connection.getResponseMessage();
           System.out.println(activelinks.get(j).getAttribute("href")+ "---->" + response);
            
		}
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}


