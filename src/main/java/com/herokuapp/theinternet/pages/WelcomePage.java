package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WelcomePage extends BasePageObject {

	
	//step 4
	private String pageUrl = "http://the-internet.herokuapp.com/"; //open page
	//step 5
	private By formAuthenticationLinkLocator = By.linkText("Form Authentication"); // click link
	private By checkboxesLinkLocator = By.linkText("Checkboxes");
	private By dropdownLinkLocator = By.linkText("Dropdown");
	private By JavaScriptAlertsLinkLocator = By.linkText("JavaScript Alerts"); 
	private By MultipleWindowsLinkLocator = By.linkText("Multiple Windows");
	private By WYSIWYGEditorLinkLocator = By.linkText("WYSIWYG Editor");
	
	
	
	//step 2
	//private WebDriver driver;
	//private Logger log;
	
	//step 3
	//this.driver = driver;
	//this.log = log;
	
	//Step 2, 3 eventually were moved to BasePageObject
	
	//step 1
	public WelcomePage(WebDriver driver, Logger log) {
		super(driver, log); //removed this log, driver and add super to send variables driver and log to BasePageObject.
	}
	
	//page open
	public void openPage() {
		log.info("Opening page:" + pageUrl);
		openUrl(pageUrl); // easy way
		log.info("Page Opened!");
		//driver.get(pageUrl)
	}

	public LoginPage clickFormAuthenticationLink() {
	log.info("Clicking Form Authentication link on Welcome Page");
	//driver.findElement(formAuthenticationLinkLocator).click(); 
	click(formAuthenticationLinkLocator); // easy way
	return new LoginPage(driver, log);
	}

	public CheckboxesPage clickCheckboxesLink() {
		log.info("Clicking Checkboxes link on Welcome Page");
		click(checkboxesLinkLocator);
		return new CheckboxesPage(driver, log);
	}
	public DropdownPage clickDropdownLink() {
		log.info("Clicking Dropdown link on Welcome page");
		click(dropdownLinkLocator);
		return new DropdownPage(driver, log);
	}

	public JavaScriptAlertsPage clickJavaScriptAlertsLink() {
		log.info("Clicking JavaScript Alerts link on Welcome Page");
		click(JavaScriptAlertsLinkLocator);
		return new JavaScriptAlertsPage(driver, log);
	}

	public WindowsPage clickMultipleWindowsLink() {
		log.info("Clicking Multiple Windows link on Welcome page");
		click(MultipleWindowsLinkLocator);
		return new WindowsPage(driver, log);
	}

	public EditorPage clickWYSIWYGEditorLink() {
		log.info("Clicking WYSIWYG Editor link on Welcome page");
		click(WYSIWYGEditorLinkLocator);
		return new EditorPage(driver, log);
	}

	public KeyPressesPage clickKeyPressesLinkLocator() {
		log.info("Clicking Key Presses link on Welcome page");
		return new KeyPressesPage(driver, log);
	}

	public FileUploaderPage clickFileUpload() {
		log.info("Clicking File Upload link on Welcome Page");
		return new FileUploaderPage(driver, log) ;
	}

}


