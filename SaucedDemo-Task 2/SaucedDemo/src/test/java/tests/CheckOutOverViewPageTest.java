package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckOutInformationPage;
import pages.CheckOutOverViewPage;
import pages.LoginPage;
import pages.ProductsPage;

public class CheckOutOverViewPageTest  extends TestBase 
{
	
	LoginPage LoginPageObject;
	ProductsPage ProductsPageObject;
	CartPage CartPageObject;
	CheckOutInformationPage CheckOutInformationPageObject;
	CheckOutOverViewPage CheckOutOverViewPageObject;
	
	@Test
	public void UserCheckOutOverView() throws InterruptedException
	{
		

		LoginPageObject = new LoginPage(driver);
		LoginPageObject.UserLogin();		
		Assert.assertEquals(LoginPageObject.Productsbar.getText(), "PRODUCTS");
		
		ProductsPageObject = new ProductsPage(driver);
		ProductsPageObject.AddProductsToCart();
		
		CartPageObject = new CartPage(driver);
		CartPageObject.CheckOutProcess();
		
		CheckOutInformationPageObject = new CheckOutInformationPage(driver);
	    CheckOutInformationPageObject.CheckOutInsertInformation();
	    
	    CheckOutOverViewPageObject = new CheckOutOverViewPage(driver);
	    CheckOutOverViewPageObject.CheckOutOverView();
		
		Thread.sleep(3000);
	}

}
