package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckOutCompletePage;
import pages.CheckOutInformationPage;
import pages.CheckOutOverViewPage;
import pages.LoginPage;
import pages.ProductsPage;

public class EndToEndFlowTest extends TestBase 
{
	

	LoginPage LoginPageObject;
	ProductsPage ProductsPageObject;
	CartPage CartPageObject;
	CheckOutInformationPage CheckOutInformationPageObject;
	CheckOutOverViewPage CheckOutOverViewPageObject;
	CheckOutCompletePage CheckOutCompletePageObject;
	
	@Test
	public void CompleteFlow() throws InterruptedException
	{
		

		LoginPageObject = new LoginPage(driver);
		LoginPageObject.UserLogin();		
		Assert.assertEquals(LoginPageObject.Productsbar.getText(), "PRODUCTS");
		Thread.sleep(3000);

		ProductsPageObject = new ProductsPage(driver);
		ProductsPageObject.AddProductsToCart();
		Thread.sleep(3000);

		CartPageObject = new CartPage(driver);
		CartPageObject.CheckOutProcess();
		Thread.sleep(3000);
		CheckOutInformationPageObject = new CheckOutInformationPage(driver);
	    CheckOutInformationPageObject.CheckOutInsertInformation();
		Thread.sleep(3000);

	    CheckOutOverViewPageObject = new CheckOutOverViewPage(driver);
	    CheckOutOverViewPageObject.CheckOutOverView();
	    
		Thread.sleep(3000);

	    CheckOutCompletePageObject = new CheckOutCompletePage(driver);
	    Assert.assertEquals(CheckOutCompletePageObject.CheckOutCompletePageHeader.getText(), "THANK YOU FOR YOUR ORDER");
		
	}

}
