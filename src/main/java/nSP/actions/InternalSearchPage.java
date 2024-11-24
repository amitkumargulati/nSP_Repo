package nSP.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import nSP.base.Page;
import nSP.pages.locators.InternalSearchPageLocators;

public class InternalSearchPage extends Page {
	
	public InternalSearchPageLocators internalSearch;
	

	public InternalSearchPage(){
		
		this.internalSearch = new InternalSearchPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.internalSearch);
		
	}
	
	public void dosearchReturn(String from,String to)
	{
	
		clear(internalSearch.from);
		type(internalSearch.from,from);
		clear(internalSearch.to);
		type(internalSearch.to,to);
	    enter(internalSearch.search);
	}
	
	public void dosearchOneWay(String from,String to,String promo) throws InterruptedException
	{
		space(internalSearch.oneWay);
		Thread.sleep(5000);
		clear(internalSearch.from);
		type(internalSearch.from,from);
		clear(internalSearch.to);
		type(internalSearch.to,to);
		 type(internalSearch.promo,promo);
	    enter(internalSearch.search);
	   
	}

	public void dosearchPnr(String pnr,String lastName) throws InterruptedException
	{
		
		clear(internalSearch.pnr);
		type(internalSearch.pnr,pnr);
		clear(internalSearch.lastName);
		type(internalSearch.lastName,lastName);
	    enter(internalSearch.lastName);
	    clickAsJs(internalSearch.searchBooking);
	}

	

}
