package nSP.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import nSP.base.Page;
import nSP.pages.locators.PurchaseExcessBaggageLocators;

public class PurchaseExcessBaggage extends Page {

	public PurchaseExcessBaggageLocators excessBaggagePage;

	public PurchaseExcessBaggage() {

		this.excessBaggagePage = new PurchaseExcessBaggageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 25);
		PageFactory.initElements(factory, this.excessBaggagePage);

	}

	public void purchaseExcessBaggage() {
		enter(excessBaggagePage.purchaseExcessBaggage);
	}
	
	public void excessTerms() {
		space(excessBaggagePage.excessTerms);
	}
	
	public void cofrmExcess() {
		enter(excessBaggagePage.cofrmExcess);
	}
	
	public void excessBaggageList() {
		try {
			select(excessBaggagePage.excessBaggageList,2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
	
