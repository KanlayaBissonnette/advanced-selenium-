package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePageObject {
	
	private String pageUrl ="http://the-internet.herokuapp.com/secure";
	private By logOutButton = By.xpath("//a[@class='button secondary radius']");
	private By message = By.id("flash");
	
	public SecureAreaPage(WebDriver driver, Logger log) {
		super(driver, log);
	}
	//get Secure page
	public String getPageUrl() {
		return pageUrl;
	}
	//LogOutbutton visible
	public boolean isLogOutBttonVisible() {
		return find(logOutButton).isDisplayed();
	}
	//Success Message pops up
	public String getSuccessMessageText() {
		return find(message).getText();
	}
}
