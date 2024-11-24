package nSP.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TripSummaryPageLocators {
	
	@FindBy(xpath="//input[@id='terms']")
	public WebElement terms;

	@FindBy(xpath="//button[@id='payment']")
	public WebElement purchase;
}
