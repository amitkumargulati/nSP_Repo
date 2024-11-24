package nSP.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import nSP.base.Page;
import nSP.pages.locators.TripSummaryPageLocators;

public class TripSummaryPage extends Page {
	
	
	public TripSummaryPageLocators tripsummary;
	

	public TripSummaryPage(){
		
		this.tripsummary = new TripSummaryPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.tripsummary);
		
	}
	
	public void terms(){
		space(tripsummary.terms);
	}
	
	public void purchase(){
		click(tripsummary.purchase);
	}
}