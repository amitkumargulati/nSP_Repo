package nSP.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import nSP.base.Page;
import nSP.pages.locators.SigninPageLocators;

public class SigninPage extends Page {
	
	
	public SigninPageLocators signinPage;
	

	public SigninPage(){
		
		this.signinPage = new SigninPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.signinPage);
		
	}
	
	public void signBtn(){
		click(signinPage.signin);
	}
	public void enterEmail(String username){
		clear(signinPage.email);
		type(signinPage.email,username);
	}
	public void enterPwd(String password){
		clear(signinPage.password);
		type(signinPage.password,password);
	}
	public void clickSbmt(){
		click(signinPage.submit);
	}
	
	/*public void doLogin(String username,String password){
		click(signinPage.signinBtn);
		clear(signinPage.email);
		type(signinPage.email,username);
		clear(signinPage.password);
		type(signinPage.password,password);
		click(signinPage.submit);
		
	}*/

}
