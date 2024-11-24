package nSP.testcases;

import nSP.utilities.Utilities;
import java.util.Hashtable;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import nSP.actions.CpgPage;
import nSP.actions.InternalSearchPage;
import nSP.actions.PurchaseExcessBaggage;
import nSP.base.Constants;
import nSP.base.Page;


@Listeners(nSP.listeners.CustomListeners.class)
public class TestCase_PurchaseExcessBaggage extends Page {

	@Test(dataProviderClass = Utilities.class, dataProvider = "getDataPNR")
	public void PurchaseExcessBaggage(Hashtable<String, String> data) throws InterruptedException {

		if (data.get("runmode").equalsIgnoreCase("N")) {

			throw new SkipException("Skipping the test as the Run mode is NO");

		}
		Page.initConfiguration();
		
		Page openurl = new Page();
		openurl.openurl(Constants.UATMMB);
		InternalSearchPage search = new InternalSearchPage();
		search.dosearchPnr(data.get("pnr"), data.get("lname"));

		PurchaseExcessBaggage excessBag = new PurchaseExcessBaggage();
		excessBag.purchaseExcessBaggage();
		Thread.sleep(35000);
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='selectbox buy-excess-select exb-sel-box']")));
		List<WebElement> excsBag = driver
				.findElements(By.xpath("//*[@class='selectbox buy-excess-select exb-sel-box']//select"));

		for (WebElement dropdown : excsBag) {

			Select select = new Select(dropdown);
			select.selectByIndex(3);
		}
		log.debug("Excess baggage Selected ");
		Thread.sleep(2000);
		excessBag.excessTerms();

		log.debug("check box clicked");

		excessBag.cofrmExcess();

		CpgPage cpg = new CpgPage();
		cpg.payVisa();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='submitBtnForm:j_id_9i']")));
		Assert.assertEquals("Your excess baggage has been confirmed..",
				driver.findElement(By.xpath("//span[contains(text(),'Your excess baggage has been confirmed..')]"))
						.getText());
		

	}
}
