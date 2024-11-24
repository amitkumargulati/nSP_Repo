package nSP.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import nSP.base.Page;
import nSP.pages.locators.CpgPageLocators;
import nSP.pages.locators.TripSummaryPageLocators;

public class CpgPage extends Page {

	public CpgPageLocators cpg;

	public CpgPage() {

		this.cpg = new CpgPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.cpg);

	}

	public void payVisa() throws InterruptedException {

		click(cpg.visa);
		type(cpg.cardNumber, "4444333322221111");

		select(cpg.expMnth, 1);

		select(cpg.expYear, 2);

		type(cpg.name, "Amit");
		type(cpg.cvv, "111");

		select(cpg.cardHolderNationality, 10);

		select(cpg.billingCntry, 10);

		type(cpg.addressLine1, "Doha");
		type(cpg.town, "Doha");
		space(cpg.consentChkBx);
		clickAsJs(cpg.confirmationBtn);
	}
}