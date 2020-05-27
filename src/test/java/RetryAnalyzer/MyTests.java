package RetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {
	
	@Test//(retryAnalyzer = RetryAnalyzer.AnalyzerRetry.class)//retryAnalyzer = packagename.
	public void login()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void reg()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void form()
	{
		Assert.assertEquals(false, true);
	}
}
