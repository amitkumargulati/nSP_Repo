package nSP.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InternalSearchPageLocators {

	@FindBy(xpath="//*[@id='fromAddress']")
	public WebElement from;
	
	@FindBy(xpath="//*[@id='toAddress']")
	public WebElement to;
	
	@FindBy(xpath="//*[@id='promoCode']")
	public WebElement promo;
	
	@FindBy(xpath="//*[@id='searchFlightsForm:roSearchFlights']")
	public WebElement search;
	
	@FindBy(xpath="//*[@id='searchFlightsForm:tirpType:1']")
	public WebElement oneWay;
	
	@FindBy(xpath="//input[@id ='pnrValue']")
	public WebElement pnr;
	
	
	@FindBy(xpath="//input[@id ='pnrlastname']")
	public WebElement lastName;
	
	@FindBy(xpath="//*[@id='searchPNRBtn']")
	public WebElement searchBooking;
	
	
	
}
