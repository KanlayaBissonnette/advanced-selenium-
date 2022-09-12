package com.herokuapp.theinternet.javascriptalertstests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.JavaScriptAlertsPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class AlertTests extends TestUtilities {

	@Test
	public void jsAlertTest() {
		log.info("Starting jsAlerts Test");

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on js alerts link
		JavaScriptAlertsPage alertsPage = welcomePage.clickJavaScriptAlertsLink();

		// click JS alert button
		alertsPage.openJSAlert();

		// get alert text
		String alertMessage = alertsPage.getAlertText();

		// Click ok button on alert
		alertsPage.acceptAlert();

		// get result text
		String result = alertsPage.getResultText();

		// Verifications
		// #1 Alert text is expected
		Assert.assertTrue(alertMessage.equals("I am a JS Alert"), "Alert Message is not expected");

		// #2
		Assert.assertTrue(result.equals("You successfully clicked an alert"), "Result is not expected.");

	}

	@Test
	public void jsDismisstTest() {
		log.info("Starting jsConfirmAlerts Test");

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on js alerts link
		JavaScriptAlertsPage alertsPage = welcomePage.clickJavaScriptAlertsLink();

		// click JS alert button
		alertsPage.openJSConfirm();

		// get alert text
		String alertMessage = alertsPage.getAlertText();

		// Click cancel button on alert
		alertsPage.disMissAlert();

		// get result text
		String result = alertsPage.getResultText();

		// Verifications
		// #1 Alert text is expected
		Assert.assertTrue(alertMessage.equals("I am a JS Confirm"), "Alert Message is not expected");

		// #2 result message
		Assert.assertTrue(result.equals("You clicked: Cancel"), "Result is not expected.");
	}

	@Test
	public void jsPromptTest() {
		log.info("Starting jsPromptAlerts Test");

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on js alerts link
		JavaScriptAlertsPage alertsPage = welcomePage.clickJavaScriptAlertsLink();

		// click JS alert button
		alertsPage.openJSPrompt();

		// get alert text
		String alertMessage = alertsPage.getAlertText();

		// Click ok button on alert
		alertsPage.typeTextIntoAlert("Alert, This is Kanlaya");

		// get result text
		String result = alertsPage.getResultText();

		// Verifications
		// #1 Alert text is expected
		Assert.assertTrue(alertMessage.equals("I am a JS prompt"), "Alert message is not expected");

		// #2 result message
		Assert.assertTrue(result.equals("You entered: Alert, This is Kanlaya"), "Alert message is not expected.");

	}

	@Test
	public void jsConfimAcceptedTest() {
		log.info("Starting jsConfimAccepted Test");

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		// Click on js alerts link
		JavaScriptAlertsPage alertsPage = welcomePage.clickJavaScriptAlertsLink();

		// click JS alert button
		alertsPage.openJSConfirm();

		// get alert text
		String alertMessage = alertsPage.getAlertText();

		// Click ok button on alert
		alertsPage.acceptAlert();

		// get result text
		String result = alertsPage.getResultText();

		// Verifications
		// #1 Alert text is expected
		Assert.assertTrue(alertMessage.equals("I am a JS Confirm"), "Alert message is not expected");

		// #2 result message
		Assert.assertTrue(result.equals("You clicked: Ok"), "Alert message is not expected.");

	}

}
