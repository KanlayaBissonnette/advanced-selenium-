package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {

	private By usernameLocator = By.id("username");
	private By passwordLocator = By.id("password");
	private By loginButtonLocator = By.tagName("Button");
	private By errorMessageLocator = By.id("flash");

	public LoginPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public SecureAreaPage logIn(String username, String password) {
		log.info("Execute Login with username [" + username + "] and password [" + password + "]");
		// driver.findElement(usernameLocator).sendKeys("username");
		// driver.findElement(passwordLocator).sendKeys("passowrd");
		// driver.findElement(loginButtonLocator).click();type(username,
		// usernameLocator);
		// use type instead of findElement.
		type(username, usernameLocator);
		type(password, passwordLocator);
		click(loginButtonLocator);
		return new SecureAreaPage(driver, log);
	}

	public void negativeLogIn(String username, String password) {
		log.info("Execute Negative Login with username [" + username + "] and password [" + password + "]");
		type(username, usernameLocator);
		type(password, passwordLocator);
		click(loginButtonLocator);
	}

	public void waitForErrorMessage() {
		waitForVisibilityOf(errorMessageLocator, 5);
	}

	public String getErrorMessageText() {
		return find(errorMessageLocator).getText();
	}
}
