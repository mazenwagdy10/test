package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductsPage;

public class ProductsPageTest extends TestBase
{
	
	LoginPage LoginPageObject;
	ProductsPage ProductsPageObject;
	
	@Test
	
	public void UserCanAddProductsToCart() 
	{
		
		LoginPageObject = new LoginPage(driver);
		LoginPageObject.UserLogin();		
		Assert.assertEquals(LoginPageObject.Productsbar.getText(), "PRODUCTS");
		
		ProductsPageObject = new ProductsPage(driver);
		ProductsPageObject.AddProductsToCart();
		//Assert.assertEquals(ProductsPageObject.ShopingCartBadge.getText(), "2");
	
		
	}
	

}
