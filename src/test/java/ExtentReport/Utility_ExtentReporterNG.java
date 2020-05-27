package ExtentReport;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Listeners.CustomListeners;



public class Utility_ExtentReporterNG {
	public static ExtentReports extent;
	public static ExtentReports extent_demo()
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
		return extent;
		
	}
}
