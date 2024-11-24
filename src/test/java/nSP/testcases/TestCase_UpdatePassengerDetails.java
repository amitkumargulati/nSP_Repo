package nSP.testcases;

import nSP.utilities.Utilities;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import nSP.actions.ApisPage;
import nSP.actions.InternalSearchPage;
import nSP.actions.ManageBookingPage;
import nSP.base.Constants;

import nSP.base.Page;


@Listeners(nSP.listeners.CustomListeners.class)

public class TestCase_UpdatePassengerDetails extends Page {

	@Test(dataProviderClass = Utilities.class, dataProvider = "getDataPNR")
	public void UpdatePassengerDetails (Hashtable<String, String> data) throws InterruptedException {

		if (data.get("runmode").equalsIgnoreCase("N")) {

			throw new SkipException("Skipping the test as the Run mode is NO");

		}
		Page.initConfiguration();
		Page openurl = new Page();
		openurl.openurl(Constants.UATMMB);
		InternalSearchPage search = new InternalSearchPage();
		search.dosearchPnr(data.get("pnr"), data.get("lname"));
		Thread.sleep(5000);
		ManageBookingPage update = new ManageBookingPage();
		update.updatePassengerDetails();
		ApisPage pax = new ApisPage();
		pax.bDay(1);
		pax.bMonth(3);
		pax.bYear(19);
		pax.cNationality(3);

		try {
			pax.passport("ABCD789");
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
		pax.email("amikumar@virtusa.com");
		pax.rEmail("amikumar@virtusa.com");
		pax.chkBox();
		pax.paxcontinue();
		update.updatepaxconfirmation();
		String confirmationmessage = driver.findElement(By.xpath("//*[@id='validateForm:SEVERITY_INFO']/div/div/ul/li")).getText();
		
	    Assert.assertEquals(confirmationmessage, "Details of all passengers have been updated successfully.");
	}
}