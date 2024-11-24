package nSP.testcases;

import nSP.utilities.Utilities;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import nSP.actions.InternalSearchPage;
import nSP.actions.ManageBookingPage;
import nSP.base.Constants;

import nSP.base.Page;

@Listeners(nSP.listeners.CustomListeners.class)

public class TestCase_EmailTripSummary extends Page {

	@Test(dataProviderClass = Utilities.class, dataProvider = "getDataPNR")
	public void EmailTripSummary(Hashtable<String, String> data) throws InterruptedException {

		if (data.get("runmode").equalsIgnoreCase("N")) {

			throw new SkipException("Skipping the test as the Run mode is NO");

		}
		Page.initConfiguration();
		Page openurl = new Page();
		openurl.openurl(Constants.UATMMB);
		InternalSearchPage search = new InternalSearchPage();
		search.dosearchPnr(data.get("pnr"), data.get("lname"));
		ManageBookingPage email = new ManageBookingPage();
		email.emailTripSummary();
		email.RecipientEmail("amikumar@virtusa.com");
		email.okButton();

	}
}