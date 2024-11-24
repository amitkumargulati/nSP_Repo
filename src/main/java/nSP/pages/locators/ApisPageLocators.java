package nSP.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ApisPageLocators {

	@FindBy(xpath = "//*[@id='paxRepeat:0:title']")
	public List<WebElement> title;

	
	@FindBy(xpath ="//*[@type='radio'and @value ='MR']")
	public WebElement titleMr;

	@FindBy(xpath = "//input[@id='paxRepeat:0:firstName']")
	public WebElement fname;

	@FindBy(xpath = "//input[@id='paxRepeat:0:lastName']")
	public WebElement lname;

	@FindBy(xpath = "//select[@id='paxRepeat:0:dobDayDD']")
	public List<WebElement> bDay;

	@FindAll({ @FindBy(xpath = "//select[@id='paxRepeat:0:dobMonthDD']"),
			@FindBy(xpath = "//select[@id='paxRepeat:0:dobmonth']") })
	public List<WebElement> bMonth;

	@FindAll({ @FindBy(xpath = "//select[@id='paxRepeat:0:dobYearDD']"),
			@FindBy(xpath = "//select[@id='paxRepeat:0:dobyear']") })
	public List<WebElement> bYear;
	
	@FindBy(xpath ="//*[@id='paxRepeat:0:dateOfBirth']")
	public WebElement Pax0DOB;

	@FindBy(xpath = "//*[@id='paxRepeat:0:paxPanel']//following::select//option")
	public List<WebElement> cNationality;

	@FindAll({ @FindBy(xpath = "//*[@id='0_PASSPORT_docNum']"),
			@FindBy(xpath = "//input[@name='paxRepeat:0:j_id_13v']") ,
	@FindBy(xpath = "//input[@name='paxRepeat:0:j_id_as']") })
	
	
	public WebElement passport;

	@FindAll({ @FindBy(xpath = "//select[@name='paxRepeat:0:j_id_13n']"),
		@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_bb']"),
			@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_14d']"),
			@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_ba']"),
			@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_14k']")
			
	})
	public List<WebElement> pExpDay;

	@FindAll({ @FindBy(xpath = "//select[@name='paxRepeat:0:j_id_13r']"),
		@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_14o']"),
		@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_bf']"),
			@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_be']"),
	
	
	})
	public List<WebElement> pExpMonth;

	@FindAll({
		@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_13v']"),
		@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_bf']"),
		@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_14l']"),
		@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_14s']"),
		@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_bi']"),
		@FindBy(xpath = "//select[@name='paxRepeat:0:j_id_bj']")
	})
	
	
	public List<WebElement> pExpYear;
	
	

	@FindAll({ @FindBy(xpath = "//*[@id='paxRepeat:0:paxvalidation']/button"),
			@FindBy(xpath = "//*[@id='paxRepeat:0:paxvalidation']") })
	public WebElement Paxcontinue;

	@FindBy(xpath = "//select[@id='contactCountry']")
	public List<WebElement> cntctCountry;

	@FindBy(xpath = "//input[@id='contactNumber']")
	public WebElement mobileNumber;

	@FindAll({ @FindBy(xpath = "//input[@id='email']"), @FindBy(xpath = "//input[@id='paxemail']") })
	public WebElement email;

	@FindAll({ @FindBy(xpath = "//input[@id='confirmEmail']") })

	public WebElement rEmail;

	@FindBy(xpath = "//*[@id='infoverified']")
	public WebElement consentPax;

	@FindAll({ @FindBy(xpath = "//input[@id='contactContinueBtn']"), @FindBy(xpath = "//*[@id='contactbtn']")

	})
	public WebElement contctContinue;
	
	@FindAll({ @FindBy(xpath = "//*[@id='paxRepeat:0:j_id_i8']"),
		@FindBy(xpath = "//*[@id='paxRepeat:0:j_id_1bg']") })
public WebElement Res_Add_L1;
	
	@FindAll({ @FindBy(xpath = "//*[@id='paxRepeat:0:j_id_j3']"),
		@FindBy(xpath = "//*[@id='paxRepeat:0:j_id_1cb']") })
public WebElement Des_Add_L1;
	

}
