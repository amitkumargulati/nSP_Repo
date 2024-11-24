package nSP.pages.locators;

import java.util.List;
import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseExcessBaggageLocators {

	@FindBy(xpath = "//*[@class='selectbox buy-excess-select exb-sel-box']//select")
	public List<WebElement> excessBaggageList;

	@FindBy(xpath = "//a[@id='manageFlights:buyexcessbaggageLink']")
	public WebElement purchaseExcessBaggage;

	@FindBy(xpath = "//input[@id='upgradeqmilesId']")
	public WebElement cofrmExcess;

	@FindAll({
		@FindBy(xpath ="//input[@id='terms']"),
		@FindBy(xpath="//div[@class='terms-cond']//label")
	})
	

	public WebElement excessTerms;

}
