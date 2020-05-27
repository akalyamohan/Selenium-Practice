package ExtentReport;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_etentreport1 extends Test_Base {
	@BeforeClass
	public void browserstart()
	{
		driver = Initialization();
	}
	
	@Test(priority=1)
	public void mentorship_page()
	{
		
		driver.findElement(By.linkText("Mentorship")).click();
		List<WebElement> sidebars = driver.findElements(By.className("testimonial"));
		int sidebars_count = sidebars.size();
		for(int i=0; i<sidebars_count;i++)
		{
			String details = sidebars.get(i).getText();
			System.out.println(details);
		}
	}

	
}
