package nSP.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import nSP.base.Page;
import nSP.pages.locators.AddonPageLocators;

public class AddonPage extends Page {

	public AddonPageLocators AddonPage;

	public AddonPage() {

		this.AddonPage = new AddonPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(factory, this.AddonPage);

	}
	
	public void AddonContinue()
	{
		click(AddonPage.AddonContinue);
	}
	

	public void StickyBar()
	{
		click(AddonPage.StickyBar);
	}
	
	
}
