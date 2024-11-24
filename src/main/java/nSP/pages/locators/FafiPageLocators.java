package nSP.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class FafiPageLocators {

	
	@FindAll({
		@FindBy(css="#flightDetailForm_outbound\\3A flightRepeatoutbound\\3A 0\\3A cabinFareRepeat\\3A 0\\3A_fare > .chkBoxIcon"),
		@FindBy(css="#flightDetailForm_outbound\\3A flightRepeatoutbound\\3A 0\\3A cabinFareRepeat\\3A 1\\3A_fare > .chkBoxIcon"),
		@FindBy(xpath ="//*[@id=\"ECONOMY_fare\"]")
	})
	public WebElement OutBoundFare;
	
	@FindAll({
		@FindBy(xpath="//*[@id='flightDetailForm_outbound:flightRepeatoutbound:0:fareFamilyRepeat:0:j_id_ui']/button"),
		@FindBy(xpath="//*[@id='flightDetailForm_outbound:flightRepeatoutbound:0:fareFamilyRepeat:0:j_id_um']/button"),
		@FindBy(xpath="//*[@id='flightDetailForm_outbound:flightRepeatoutbound:0:fareFamilyRepeat:1:j_id_ui']/button"),
		@FindBy(xpath="//*[@id='flightDetailForm_outbound:flightRepeatoutbound:0:fareFamilyRepeat:1:j_id_um']/button"),
		@FindBy(xpath="//*[@id='flightDetailForm_outbound:flightRepeatoutbound:1:fareFamilyRepeat:0:j_id_ui']/button"),
		@FindBy(xpath="//*[@id='flightDetailForm_outbound:flightRepeatoutbound:1:fareFamilyRepeat:0:j_id_um']/button"),
		@FindBy(xpath="//*[@id='recoId_0']"),
		@FindBy(xpath="//*[@id='recoId_1']"),
		@FindBy(xpath="//*[@id='flightDetailForm_outbound:flightRepeatoutbound:0:fareFamilyRepeat:0:j_id_uf']/button"),
		@FindBy(xpath="//*[@id='flightDetailForm_outbound:flightRepeatoutbound:1:fareFamilyRepeat:0:j_id_uf']/button"),
		@FindBy(xpath="//*[@id='recoId_3']"),
		@FindBy(xpath="//*[@id=\"flightDetailForm_outbound:flightRepeatoutbound:0:j_id_pn:0:fareFamilyRepeat:1:j_id_r6\"]/button"),
		@FindBy(xpath="//*[@id=\"flightDetailForm_outbound:flightRepeatoutbound:0:j_id_pn:0:fareFamilyRepeat:0:j_id_r6\"]/button"),
		
	})
	public WebElement OutBoundFareCard;
	
	
	@FindAll({
		
		//*[@id="flightDetailForm_inbound:flightRepeatinbound:0:cabinFareRepeat:0:_fare"]/span[1]
		@FindBy(css="#flightDetailForm_inbound\\3A flightRepeatinbound\\3A 0\\3A cabinFareRepeat\\3A 0\\3A_fare"),
		@FindBy(xpath="//*[@id='flightDetailForm_inbound:flightRepeatinbound:0:cabinFareRepeat:0:_fare']/span[1]"),
		@FindBy(css="#flightDetailForm_inbound\\3A flightRepeatinbound\\3A 1\\3A cabinFareRepeat\3A 0\\3A_fare  >.chkBoxIcon"),
		@FindBy(xpath="//*[@id='flightDetailForm_inbound:flightRepeatinbound:1:cabinFareRepeat:0:_fare']/span[1]"),
		@FindBy(xpath="//*[@id=\"flightDetailForm_outbound:flightRepeatoutbound:0:j_id_rs:0:fareFamilyRepeat:0:j_id")
	})
	public WebElement InBoundFare;
	
	@FindAll({
		@FindBy(xpath="//*[@id='flightDetailForm_inbound:flightRepeatinbound:0:fareFamilyRepeat:0:j_id_1l8']/button"),
		@FindBy(xpath="//*[@id='flightDetailForm_inbound:flightRepeatinbound:0:fareFamilyRepeat:0:j_id_1l4']/button"),
		@FindBy(xpath="//*[@id='flightDetailForm_inbound:flightRepeatinbound:1:fareFamilyRepeat:0:j_id_1l8']/button"),
		@FindBy(xpath="//*[@id='flightDetailForm_inbound:flightRepeatinbound:0:fareFamilyRepeat:1:j_id_1l4']/button"),
		@FindBy(xpath="//*[@id='recoId_7']"),
		@FindBy(xpath="//*[@id='recoId_4']"),
		@FindBy(xpath="//*[@id='recoId_5']"),
		@FindBy(xpath="//*[@id='recoId_6']"),
		@FindBy(xpath="//*[@id='recoId_9']")
	
	})
	public WebElement InBoundFareCard;
	
	
	@FindBy(xpath = "//*[@id='reviewContinue:continueToFlightSelection' or @value='continue']")
	public WebElement Fafi_Continue_Button;
	
	
	
}
