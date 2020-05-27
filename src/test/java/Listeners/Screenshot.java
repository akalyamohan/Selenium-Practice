package Listeners;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class Screenshot extends Base {

	@BeforeMethod
	public void setup()
	{
		Initialization();
	}
	
	
	
	@Test
	public void takescreenshot()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void login()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void logout()
	{
		Assert.assertEquals(false, true);
	}
}
