package ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport_Test {
	WebDriver driver;
	ExtentReports extent;
	
	@BeforeClass
	public void extent_demo()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
	
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Automation Results of ExtentReport Project");
		report.config().setDocumentTitle("ExtentReport Project Results");
		String timestamp = report.config().getTimeStampFormat();
		System.out.println(timestamp);
		
		 extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("QA Analyst", "Akalya");
		
	}
	
	@Test
	public void invokingbrowser()
	{
		ExtentTest test = extent.createTest("invoking browser");
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		test.pass(pagetitle);
		extent.flush();
		driver.close();
	}

}
