package ExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners_custom implements ITestListener{
	ExtentTest test;
	ExtentReports extent = Utility_ExtentReporterNG.extent_demo();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		// test.pass(result.getMethod().getMethodName());
		 extentTest.get().pass(result.getMethod().getMethodName());
		//test.log(Status.PASS, "Successful");
		extentTest.get().log(Status.PASS, "Successful");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//test.fail(result.getThrowable());
		extentTest.get().fail(result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
