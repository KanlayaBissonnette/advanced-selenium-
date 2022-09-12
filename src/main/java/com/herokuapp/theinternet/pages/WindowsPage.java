package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsPage extends BasePageObject {

	private By clickHereLinkLocator = By.linkText("Click Here");
	
	public WindowsPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	//open new window
	public void openNewWindow() {
		log.info("Clicking 'click here' link");
		click(clickHereLinkLocator);	
	}
	//verify new window
	public NewWindowPage switchToNewWindowPage() {
		log.info("Looking for 'New Window' page");
		switchToNewWindowWithTitle("New Window");
		return new NewWindowPage(driver, log);
	}

}
