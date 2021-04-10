package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;

public class CartPageTest extends TestBase {

	
	LoginPage LoginPageObject;
	ProductsPage ProductsPageObject;
	CartPage CartPageObject;
	
	@Test
	public void UserCanChecOut() throws InterruptedException
	{
		

		LoginPageObject = new LoginPage(driver);
		LoginPageObject.UserLogin();		
		Assert.assertEquals(LoginPageObject.Productsbar.getText(), "PRODUCTS");
		
		ProductsPageObject = new ProductsPage(driver);
		ProductsPageObject.AddProductsToCart();
		
		CartPageObject = new CartPage(driver);
		CartPageObject.CheckOutProcess();
		Thread.sleep(3000);
		//Assert.assertEquals(CartPageObject.CartPageTitle.getText().contains(s),"check");
		
	}
	
	
}
