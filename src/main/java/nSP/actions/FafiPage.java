package nSP.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import nSP.base.Page;
import nSP.pages.locators.FafiPageLocators;

public class FafiPage extends Page {

	public FafiPageLocators FafiPage;

	public FafiPage() {

		this.FafiPage = new FafiPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.FafiPage);

	}

	public void SelectOutboundFare() {
		click(FafiPage.OutBoundFare);
	}
	
	public void SelectOutboundcard() {
		click(FafiPage.OutBoundFareCard);
	}
	
	public void SelectIutboundFare() {
		click(FafiPage.InBoundFare);
	}
	
	public void SelectIutboundcard() {
		click(FafiPage.InBoundFareCard);
	}
	
	
	public void FafiContinue() {
		
		enter(FafiPage.Fafi_Continue_Button);
	}
}