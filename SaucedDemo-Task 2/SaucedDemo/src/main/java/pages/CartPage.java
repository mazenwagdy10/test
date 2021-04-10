package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase{

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="checkout")
	WebElement CheckOutBtn;
	
	@FindBy(className="title")
	public WebElement CartPageTitle;
	
	public void CheckOutProcess()
	{
		CheckOutBtn.click();
		
	}

}
