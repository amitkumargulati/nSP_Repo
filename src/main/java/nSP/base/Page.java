package nSP.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import nSP.actions.TopNavigation;
import nSP.utilities.ExcelReader;
import nSP.utilities.ExtentManager;

public class Page {

	/*
	 * WebDriver
	 * ExcelReader Logs WebDriverWait ExtentReports
	 */
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	public static WebDriverWait Fluentwait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;
	public static TopNavigation topNav;
	public static void initConfiguration() {

		if (Constants.browser.equals("firefox")) {

			driver = new FirefoxDriver();
			log.debug("Launching Firefox");
		} else if (Constants.browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");

			
			Map<String, Object> prefs = new HashMap<String, Object>();
			 prefs.put("profile.default_content_setting_values.notifications",
			 2); prefs.put("credentials_enable_service", false);
			 prefs.put("profile.password_manager_enabled", false);
			 ChromeOptions options = new ChromeOptions();
			 options.setExperimentalOption("prefs", prefs);
			 options.addArguments("--disable-extensions");
			 options.addArguments("--disable-infobars");
			 
			 driver = new ChromeDriver(options);
			 
		//	driver = new ChromeDriver();
			log.debug("Launching Chrome");
		} else if (Constants.browser.equals("ie")) {

			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
			log.debug("Launching IE");
		}

		// driver.get(Constants.testsiteurl);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Constants.implicitwait, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 25);

		topNav = new TopNavigation(driver);

	}
	@AfterMethod
	public static void AfterMethod(){
	    
		if (driver != null) {
			driver.quit();
		}

		log.debug("test execution completed !!!");
	 }
	@AfterTest
	public static void AfterTest() {

		if (driver != null) {
			driver.quit();
		}

		log.debug("test execution completed !!!");

	}
	
	

	

	public void openurl(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (InvalidElementStateException e) {
			test.log(LogStatus.INFO, "Application: " + url + " is not reachable", "FAIL");
			throw new InvalidElementStateException();
		} catch (WebDriverException e) {
			test.log(LogStatus.INFO, "WebDriverException" + e.getMessage(), "FAIL");
			throw new InvalidElementStateException();
		}
	}

	public static void clear(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.clear();

			log.debug("Clearing Element : " + element); 
			test.log(LogStatus.INFO, "Clearing on : " + element );
		} catch (InvalidElementStateException e) {
			test.log(LogStatus.INFO, "The element: " + element + " is not interactable", "FAIL");
			throw new InvalidElementStateException();
		} catch (WebDriverException e) {
			test.log(LogStatus.INFO, "WebDriverException" + e.getMessage(), "FAIL");
			throw new InvalidElementStateException();
		}
	}

	public static void click(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(element).build();
			mouseOverHome.perform();
			element.click();
			log.debug("Clicking on an Element : " + element);
			test.log(LogStatus.INFO, "Clicking on : " + element);
		} catch (InvalidElementStateException e) {
			test.log(LogStatus.INFO, "The element: " + element + " is not interactable", "FAIL");
			throw new InvalidElementStateException();
		} catch (WebDriverException e) {
			test.log(LogStatus.INFO, "WebDriverException" + e.getMessage(), "FAIL");
			throw new InvalidElementStateException();
		}
	}

	public static void space(WebElement element) {
		try {
			//wait.until(ExpectedConditions.elementSelectionStateToBe(locator, selected);(element));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(element).build();
			mouseOverHome.perform();
			element.sendKeys(Keys.SPACE);
			log.debug("Clicking on an Element : " + element);
			test.log(LogStatus.INFO, "Clicking on : " + element);
		} catch (InvalidElementStateException e) {
			test.log(LogStatus.INFO, "The element: " + element + " is not interactable", "FAIL");
			throw new InvalidElementStateException();
		} catch (WebDriverException e) {
			test.log(LogStatus.INFO, "WebDriverException" + e.getMessage(), "FAIL");
			throw new InvalidElementStateException();
		}
	}

	public static void mouseOver(WebElement element) {
		try {
		wait.until(ExpectedConditions.elementToBeClickable(element));
			// wait.until(ExpectedConditions.elementToBeSelected(element));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(element).build();
			mouseOverHome.perform();
			//element.sendKeys(Keys.SPACE);
			log.debug("Clicking on an Element : " + element);
			test.log(LogStatus.INFO, "Clicking on : " + element);
		} catch (InvalidElementStateException e) {
			test.log(LogStatus.INFO, "The element: " + element + " is not interactable", "FAIL");
			throw new InvalidElementStateException();
		} catch (WebDriverException e) {
			test.log(LogStatus.INFO, "WebDriverException" + e.getMessage(), "FAIL");
			throw new InvalidElementStateException();
		}
	}

	public static void enter(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(element).build();
			mouseOverHome.perform();
			element.sendKeys(Keys.ENTER);

			log.debug("Clicking on an Element : " + element);
			test.log(LogStatus.INFO, "Clicking on : " + element);
		} catch (InvalidElementStateException e) {
			test.log(LogStatus.INFO, "The element: " + element + " is not interactable", "FAIL");
			throw new InvalidElementStateException();
		} catch (WebDriverException e) {
			test.log(LogStatus.INFO, "WebDriverException" + e.getMessage(), "FAIL");
			throw new InvalidElementStateException();
		}
	}

	public static void type(WebElement element, String value) {
		try {

			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.sendKeys(value);

			log.debug("Typing in an Element : " + element + " entered value as : " + value);

			test.log(LogStatus.INFO, "Typing in : " + element + " entered value as " + value);

		} catch (InvalidElementStateException e) {
			test.log(LogStatus.INFO, "The element: " + element + " is not interactable", "FAIL");
			throw new InvalidElementStateException();
		} catch (WebDriverException e) {
			test.log(LogStatus.INFO, "WebDriverException" + e.getMessage(), "FAIL");
			throw new InvalidElementStateException();
		}
	}
	public static void select(List<WebElement> element, int value) throws InterruptedException {
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
		Thread.sleep(2000);
		try {
			for (WebElement dropdown : element) {

				Select select = new Select(dropdown);
				select.selectByIndex(value);
			}

			log.debug("Typing in an Element : " + element + " entered value as : " + value);

			test.log(LogStatus.INFO, "Typing in : " + element + " entered value as " + value);
		} catch (InvalidElementStateException e) {
			test.log(LogStatus.INFO, "The element: " + element + " is not interactable", "FAIL");
			throw new InvalidElementStateException();
		} catch (WebDriverException e) {
			test.log(LogStatus.INFO, "WebDriverException" + e.getMessage(), "FAIL");
			throw new InvalidElementStateException();
		}

	}

	public static void clickAsJs(WebElement element) {

		// @SuppressWarnings("unused")
		String text = "";
		try {
			// WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(element).build();
			mouseOverHome.perform();
			text = element.getText();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			log.debug("Clicking on an Element : " + element);
			test.log(LogStatus.INFO, "Clicking on : " + element);
		} catch (InvalidElementStateException e) {
			test.log(LogStatus.INFO, "The element: " + element + " is not interactable", "FAIL");
			throw new InvalidElementStateException();
		} catch (WebDriverException e) {
			test.log(LogStatus.INFO, "WebDriverException" + e.getMessage(), "FAIL");
			throw new InvalidElementStateException();
		}
	}

	public static void select1(List<WebElement> Value, int Selectdropdowntype) {

		Select selector = new Select((WebElement) Value);
		switch (Selectdropdowntype) {
		case 1:
			selector.selectByIndex(1);
			break;
		case 2:
			selector.selectByIndex(2);
			break;

		default:
			System.out.println("Invalid value is entered for selection ");
			break;
		}
	}
	public static class ElementNaming {

	    //Create a hashmap that stores the name of the element as a string
	    public static final HashMap<WebElement, String> webElementKeys = new HashMap<WebElement, String>();

	    public static final By by = By.id("hplogo");

	    public WebElement instantiateWebElementAndName(String name, By by) {
	        webElementKeys.put(driver.findElement(by), name);
	        return driver.findElement(by);
	    }
}}
