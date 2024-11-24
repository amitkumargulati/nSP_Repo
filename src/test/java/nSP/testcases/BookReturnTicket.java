package nSP.testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.SkipException;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import nSP.actions.*;
import nSP.base.Constants;
import nSP.base.Page;
import nSP.utilities.Utilities;

@Listeners(nSP.listeners.CustomListeners.class)
public class BookReturnTicket {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void bookReturnTicket(Hashtable<String, String> data) throws InterruptedException {

		if (data.get("runmode").equalsIgnoreCase("N")) {

			throw new SkipException("Skipping the test as the Run mode is NO");

		}
		Page.initConfiguration();
		Page openurl = new Page();
		openurl.openurl(Constants.productionurl);
		InternalSearchPage search = new InternalSearchPage();
		search.dosearchReturn(data.get("from"), data.get("to"));
		FafiPage fare = new FafiPage();
		fare.SelectOutboundFare();

		fare.SelectOutboundcard();
		Thread.sleep(6000);
		fare.SelectIutboundFare();
		fare.SelectIutboundcard();
		Thread.sleep(6000);
		fare.FafiContinue();
		ApisPage pax = new ApisPage();
		pax.SelectTitle(1);
		pax.FirstName(data.get("firstname"));
		pax.LastName("Kumar");
		pax.bDay(1);
		pax.bMonth(2);
		pax.bYear(19);
		pax.cNationality(3);

		try {
			pax.passport(data.get("passport"));
			pax.pExpDay(1);
			pax.pExpMonth(2);
			pax.pExpYear(5);
			pax.Res_Add_L1("Test");
			pax.Des_Add_L1("Test");
		} catch (Throwable e) {

		}
		pax.coninue();
		Thread.sleep(2000);
		pax.cntctCountry(2);
		pax.phoneNumber("9989898989");
		pax.email(data.get("email"));
		// pax.rEmail(data.get("rEmail"));
		pax.chkBox();
		pax.paxcontinue();

		AddonPage addon = new AddonPage();
		Thread.sleep(20000);

		addon.AddonContinue();
		TripSummaryPage trip = new TripSummaryPage();
		trip.terms();
		trip.purchase();
		CpgPage cpg = new CpgPage();
		cpg.payVisa();

	}

}
