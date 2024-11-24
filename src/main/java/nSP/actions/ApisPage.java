package nSP.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import nSP.base.Page;
import nSP.pages.locators.ApisPageLocators;

public class ApisPage extends Page {

	public ApisPageLocators ApisPage;

	public ApisPage() {

		this.ApisPage = new ApisPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(factory, this.ApisPage);

	}

	public void SelectTitle(int title) {
		try {
			select(ApisPage.title, 1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void SelectTitleMr() {
		clickAsJs(ApisPage.titleMr);
	}

	public void FirstName(String fname) {
		type(ApisPage.fname, fname);
	}

	public void LastName(String lname) {
		type(ApisPage.lname, lname);
	}

	public void bDay(int day) {
		try {
			select(ApisPage.bDay, day);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void bMonth(int month) {
		try {
			select(ApisPage.bMonth, month);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void bYear(int year) {
		try {
			select(ApisPage.bYear, year);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Pax0DOB(String DOB) {
		type(ApisPage.Pax0DOB, DOB);
	}

	public void cNationality(int nation) {
		try {
			select(ApisPage.cNationality, nation);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void passport(String pass) {
		clear(ApisPage.passport);
		type(ApisPage.passport, pass);
	}

	public void pExpDay(int day) {
		try {
			select(ApisPage.pExpDay, day);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void pExpMonth(int month) {
		try {
			select(ApisPage.pExpMonth, month);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void pExpYear(int year) {
		try {
			select(ApisPage.pExpYear, year);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void coninue() {
		clickAsJs(ApisPage.Paxcontinue);
	}

	public void cntctCountry(int cont) {
		// click(ApisPage.cntctCountry);
		try {
			select(ApisPage.cntctCountry, cont);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void phoneNumber(String number) {
		clear(ApisPage.mobileNumber);
		type(ApisPage.mobileNumber, number);
	}

	public void email(String email) {
		clear(ApisPage.email);
		type(ApisPage.email, email);
	}

	public void rEmail(String email) {
		clear(ApisPage.rEmail);
		type(ApisPage.rEmail, email);
	}

	public void chkBox() {
		space(ApisPage.consentPax);
	}

	public void paxcontinue() {
		clickAsJs(ApisPage.contctContinue);
	}

	public void Res_Add_L1(String address) {
		clear(ApisPage.Res_Add_L1);
		type(ApisPage.Res_Add_L1, address);
	}

	public void Des_Add_L1(String address) {
		clear(ApisPage.Des_Add_L1);
		type(ApisPage.Des_Add_L1, address);
	}

}
