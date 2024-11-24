package nSP.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CpgPageLocators {
	
	@FindBy(xpath="//a[@id='VIpayment-type']")
	public WebElement visa;
	
	@FindBy(xpath="//a[@id='CApayment-type']")
	public WebElement masterCard;
	
	@FindBy(xpath="//input[@id='cardNumber']")
	public WebElement cardNumber;
	
	@FindBy(xpath="//select[@id='expMonth']")
	public List<WebElement> expMnth;
	
	@FindBy(xpath="//select[@id='expYear']")
	public List<WebElement> expYear;
	
	@FindBy(xpath="//input[@id='nameOnCard']")
	public WebElement name;
	
	@FindBy(xpath="//input[@id='cvvCodeMasked']")
	public WebElement cvv;
	
	
	@FindBy(xpath="//select[@id='cardHolderNationaility']")
	public List<WebElement> cardHolderNationality;
	
	@FindBy(xpath="//select[@id='billingData.country']")
	public List<WebElement> billingCntry;
	
	@FindBy(xpath="//input[@id='billingData.street1']")
	public WebElement addressLine1;
	
	@FindBy(xpath="//input[@id='billingData.city']")
	public WebElement town;
	
	@FindBy(id="billingData.zipCode")
	public WebElement zipCode;
	
	
	@FindBy(id="billingData.city")
	public WebElement cityName;
	
	@FindBy(xpath="//section[@id='payButton']//input[@id='agreeTerms']")
	public WebElement consentChkBx;
	
	
	@FindBy(xpath="//a[@id='ccFeeConfirmBtn']")
	public WebElement confirmationBtn;
	

}
