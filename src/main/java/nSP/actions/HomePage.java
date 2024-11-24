package nSP.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import nSP.base.Page;
import nSP.pages.locators.HomePageLocators;

public class HomePage extends Page {

	public HomePageLocators home;

	public HomePage() {

		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);

	}

	public HomePage discover() {

		return this;
	}

	public HomePage gotoBook() {

		return this;

	}

	public HomePage gotojourney() {
		return this;

	}

	public void bookAFlight(String from, String to, String departing, String returning) {

		type(home.fromCity, from);
		type(home.toCity, to);

		type(home.departFlight, departing);
		type(home.returnFlight, returning);	
		click(home.search);

	}

}
