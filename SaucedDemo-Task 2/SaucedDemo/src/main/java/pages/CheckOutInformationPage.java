package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutInformationPage extends PageBase {

	public CheckOutInformationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="first-name")
	WebElement FirstNameTxtField;
	
	@FindBy(id="last-name")
	WebElement LastNameTxtField;
	
	@FindBy(id="postal-code")
	WebElement PostalCodeTxtField;
	
	
	@FindBy(id="continue")
	WebElement ContinueBtn;
	
	public void CheckOutInsertInformation()
	{
		FirstNameTxtField.sendKeys("Mazen");
		LastNameTxtField.sendKeys("Wagdy");
		PostalCodeTxtField.sendKeys("0000");
		ContinueBtn.click();
		
	}
	

}
