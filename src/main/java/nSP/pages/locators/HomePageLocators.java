package nSP.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePageLocators {
	
	

	@FindBy(xpath = "//*[@id='tab1']")
	public WebElement flightTab;
	
	//locators for flight booking
	@FindBy(xpath = "//*[@id='T7-from']")
	public WebElement fromCity;
	@FindBy(xpath = "//*[@id='T7-to']")
	public WebElement toCity;
	@FindBy(xpath = "//*[@id='T7-departure_1']")
	public WebElement departFlight;
	@FindBy(xpath = "//*[@id='T7-arrival_1']")
	public WebElement returnFlight;
	/*@FindBy(css = "#flight-adults")
	public WebElement adultCount;
	@FindBy(css = "#flight-children")
	public WebElement childCount;*/
	@FindBy(xpath = "//*[@id='T7-search']")
	public WebElement search;
	

}
