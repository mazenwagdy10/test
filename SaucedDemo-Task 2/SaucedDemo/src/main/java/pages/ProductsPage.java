package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase {

	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement AddToCartBtnBackPack;
	
	@FindBy(className="shopping_cart_link")
	WebElement ShopingCart;
	
	@FindBy(className="shopping_cart_badge")
	public WebElement ShopingCartBadge;
	
	public void AddProductsToCart()
	{
		
		AddToCartBtnBackPack.click();
		ShopingCart.click();
	}

}
