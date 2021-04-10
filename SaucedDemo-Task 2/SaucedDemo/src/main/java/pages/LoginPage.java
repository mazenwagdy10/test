package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id="user-name")
	WebElement UserNameTxtField;
	
	
	@FindBy(id="password")
	WebElement PasswordTxtField;
	
	@FindBy(id="login-button")
	WebElement LoginBtn;
	
	@FindBy(className="title")
	public WebElement Productsbar;
	
	public void UserLogin()
	{
		UserNameTxtField.sendKeys("standard_user");
		PasswordTxtField.sendKeys("secret_sauce");
		LoginBtn.click();
		
	}
}
