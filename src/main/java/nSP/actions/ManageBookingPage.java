package nSP.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import nSP.base.Page;
import nSP.pages.locators.ManageBookingPageLocators;

public class ManageBookingPage extends Page {
	
	public ManageBookingPageLocators managebooking;
	

	public ManageBookingPage(){
		
		this.managebooking = new ManageBookingPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, this.managebooking);
		
	}
	
	public void emailTripSummary()
	{
		enter(managebooking.emailTripSummary);
	}
	
	public void RecipientEmail(String email)
	{
		type(managebooking.RecipientEmail,email);
	}
	
	public void okButton()
	{
		enter(managebooking.okButton);
	}
	
	public void mealPreference()
	{
		enter(managebooking.mealPreference);
	}
	
	
	public void updatePassengerDetails()
	{
		enter(managebooking.updatePassengerDetails);
	}

	public void updatepaxconfirmation()
	{
		mouseOver(managebooking.updatePassengerDetails);
	}
	
	
	
	
}

