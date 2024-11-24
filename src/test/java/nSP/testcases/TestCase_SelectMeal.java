package nSP.testcases;

import nSP.utilities.Utilities;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.SkipException;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import nSP.actions.InternalSearchPage;
import nSP.actions.ManageBookingPage;
import nSP.base.Constants;

import nSP.base.Page;


@Listeners(nSP.listeners.CustomListeners.class)

public class TestCase_SelectMeal extends Page {

	@Test(dataProviderClass = Utilities.class, dataProvider = "getDataPNR")
	public void testCaseSelectMeal(Hashtable<String, String> data) throws InterruptedException {

		if (data.get("runmode").equalsIgnoreCase("N")) {

			throw new SkipException("Skipping the test as the Run mode is NO");

		}
		Page.initConfiguration();
		Page openurl = new Page();
		openurl.openurl(Constants.UATMMB);
		InternalSearchPage search = new InternalSearchPage();
		search.dosearchPnr(data.get("pnr"), data.get("lname"));
		ManageBookingPage meal = new ManageBookingPage();
		meal.mealPreference();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@aria-pressed='false']")));
		List<WebElement> MealTabs = driver.findElements(By.xpath("//a[starts-with(@id,'flight-tab')]"));

		for (int i = 0; i < MealTabs.size(); i++) {
			WebElement requiredlisting = MealTabs.get(i);
			requiredlisting.click();
			List<WebElement> paxlinks = null;

			paxlinks = driver.findElements(By.xpath(
					"//*[@id='mealForm:flightRepeat:" + i + ":paxDetails']/li//a[starts-with(@class,'regLink')]"));

			for (int j = 0; j < paxlinks.size(); j++) {

				WebElement pax = paxlinks.get(j);
				pax.click();

				List<WebElement> allLinks = null;
				{

					allLinks = driver.findElements(By.xpath("//*[@id='mealForm:flightRepeat:" + i + ":paxRepeat:" + j
							+ ":spmlList']//a[@id='selectPaxSpecialMeal' and @aria-pressed ='false']"));

					for (WebElement link : allLinks) {
						if (link.getAttribute("id").endsWith("selectPaxSpecialMeal") && link.isDisplayed()
								&& link.isEnabled()) {
							Random r = new Random();
							int randomValue = r.nextInt(allLinks.size() - allLinks.size() + 2);
							allLinks.get(randomValue).sendKeys(Keys.ENTER);
							break;
						}
					}

				}
			}

		}
		driver.findElement(By.xpath("//input[@id='mealForm:j_id_31']")).sendKeys(Keys.ENTER);
		// Assert.("Your preferences have been updated successfully.",
		// driver.findElement(By.xpath("//div[@class='mb-confirmation-note']")).getText());

	}
}
