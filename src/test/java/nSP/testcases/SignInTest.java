package nSP.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import nSP.actions.*;
import nSP.base.Constants;
import nSP.base.Page;
import nSP.utilities.Utilities;


@Listeners(nSP.listeners.CustomListeners.class)
public class SignInTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void signInTest(Hashtable<String, String> data) {

		if (data.get("runmode").equalsIgnoreCase("N")) {

			throw new SkipException("Skipping the test as the Run mode is NO");

		}
		Page.initConfiguration();
		Page openurl = new Page();
		openurl.openurl(Constants.productionAEM);
		SigninPage signin = new SigninPage();
		signin.signBtn();
		signin.enterEmail(data.get("username"));
		signin.enterPwd(data.get("password"));
		signin.clickSbmt();
		//HomePage search = new HomePage();
		//search.bookAFlight(data.get("from"), data.get("to"), data.get("dDate"), data.get("rDate"));

	}

}
