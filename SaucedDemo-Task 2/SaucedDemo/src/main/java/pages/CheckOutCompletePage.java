package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutCompletePage extends PageBase
{

	public CheckOutCompletePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"checkout_complete_container\"]/h2")
	public WebElement CheckOutCompletePageHeader;
	
	
	

}
