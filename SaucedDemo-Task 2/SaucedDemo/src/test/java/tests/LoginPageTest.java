package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends TestBase 
{
	
	LoginPage LoginPageObject;
	
	@Test
	public void UserCanLogin()
	{
		LoginPageObject = new LoginPage(driver);
		LoginPageObject.UserLogin();		
		Assert.assertEquals(LoginPageObject.Productsbar.getText(), "PRODUCTS");
	}

}
