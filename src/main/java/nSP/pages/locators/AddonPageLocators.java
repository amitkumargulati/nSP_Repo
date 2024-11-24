package nSP.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class AddonPageLocators {

	@FindBy(xpath = "//a[@class='btn seatselection']")
	public WebElement SelectSeat;

	@FindBy(xpath = "//a[@class='btn addtocart  insuranceSelected']")
	public WebElement Insurance;

	@FindBy(xpath = "//a[@class='btn seatselection']")
	public WebElement Lounge;

	@FindBy(xpath = "//a[@class='btn seatselection']")
	public WebElement AlMaha;

	@FindBy(css = "#anci_ins_purchase")

	public WebElement AddonContinue;

	@FindBy(xpath = "//*[@div='sel-Total']")
	public WebElement StickyBar;

}
