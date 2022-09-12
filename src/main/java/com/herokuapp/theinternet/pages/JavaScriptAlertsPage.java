package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage extends BasePageObject{

	private By clickforJSAlertButtonLocator = By.xpath("//div[@id='content']//ul//button[.='Click for JS Alert']");
	private By clickforJSConfirmButtonLocator = By.xpath("//div[@id='content']//ul//button[.='Click for JS Confirm']");
	private By clickforJSPromptButtonLocator = By.xpath("//div[@id='content']//ul//button[.='Click for JS Prompt']");
	private By resultTextLocator = By.xpath("/html//p[@id='result']");
	
	public JavaScriptAlertsPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void openJSAlert() {
		log.info("Clicking JS Alert Button on Alert Page");
		click(clickforJSAlertButtonLocator);
	}

	public void openJSConfirm() {
		log.info("Clicking JS Confirm Button on Alert Page");
		click(clickforJSConfirmButtonLocator);
	}
	public void openJSPrompt() {
		log.info("Clicking JS Prompt Button on Alert Page");
		click(clickforJSPromptButtonLocator);
	}
		
	public String getAlertText() {
		Alert alert = switchToAlert();
		String alertText = alert.getText();
		log.info("Alert Says:" +alertText);
		return alertText;
	}


	public void acceptAlert() {
		log.info("Switching to alert and pressing OK");
		Alert alert = switchToAlert();
		alert.accept();
		
	}
	public void disMissAlert() {
		log.info("Switching to alert and pressing Cancel");
		Alert alert = switchToAlert();
		alert.dismiss();
	}
	public void typeTextIntoAlert(String text) {
		log.info("Type text into alert and click OK");
		Alert alert = switchToAlert();
		alert.sendKeys(text);
		alert.accept();
	}
	
	public String getResultText() {
		String result = find(resultTextLocator).getText();
		log.info("Result text:" + result);
		return result;
	}

}
