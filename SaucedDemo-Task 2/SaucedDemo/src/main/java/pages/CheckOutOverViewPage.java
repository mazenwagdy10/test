package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutOverViewPage extends PageBase{

	public CheckOutOverViewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="finish")
	WebElement FinishBtn;
	
	public void CheckOutOverView()
	{
		FinishBtn.click();
		
	}

}
