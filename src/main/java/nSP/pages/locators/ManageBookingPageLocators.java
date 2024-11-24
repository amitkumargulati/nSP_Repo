package nSP.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageBookingPageLocators {
	
	@FindBy(xpath="//*[@id='quickActions:emailItineraryLink']")
	public WebElement emailTripSummary;
	
	@FindBy(xpath="//*[@id='emailItinerary:emailPopup']")
	public WebElement RecipientEmail;
	
	//@FindBy(xpath="//div[.//a[text()='OK']]/a[@class='btn popupButn btn-4 btn-4c arrow-right-btn']")
	@FindBy(xpath="//*[@id='emailItinerary']/div/div/div/div/div/a")
	
	public WebElement okButton;
	
	@FindBy(xpath="//*[@id='manageFlights:mealpreferenceLink']")
	public WebElement mealPreference;
	
	@FindBy(xpath="//*[@id='manageFlights:updatePassengerDetailsLink']")
	public WebElement updatePassengerDetails;
	
	
	@FindBy(xpath="//*[@id='validateForm:SEVERITY_INFO']/div/div/ul/li")
	public WebElement updatepaxconfirmation;
	
	
	
	
	
	
	

}
