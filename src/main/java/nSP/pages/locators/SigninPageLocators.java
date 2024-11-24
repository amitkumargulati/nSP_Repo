package nSP.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPageLocators {
	
	@FindBy(css="#loginMenuHeader")
	public WebElement signinBtn;
	@FindBy(xpath="//a[@id='loginMenuHeader']")
	public WebElement signin;
	@FindBy(css="#f1003")
	public WebElement email;
	@FindBy(css="#f1001")
	public WebElement password;
	@FindBy(css="#loginButtonInvoke")
	public WebElement submit;

}
