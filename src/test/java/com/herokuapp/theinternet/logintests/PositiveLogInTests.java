package com.herokuapp.theinternet.logintests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.SecureAreaPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class PositiveLogInTests extends TestUtilities {

	@Test
	public void logInTest() {
		log.info("Starting logIn test");

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();
		//String url = "http://the-internet.herokuapp.com/";
		//driver.get(url);
		//log.info("Main page is opened.");

		// Click on Form Authentication link
		LoginPage loginPage = welcomePage.clickFormAuthenticationLink();
		//driver.findElement(By.linkText("Form Authentication")).click();

		// execute Log in
		SecureAreaPage secureAreaPage = loginPage.logIn("tomsmith", "SuperSecretPassword!");
		
		//driver.findElement(By.id("username")).sendKeys("tomsmith");
		//driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// push log in button
		//WebElement logInButton = driver.findElement(By.className("radius"));
		//wait.until(ExpectedConditions.elementToBeClickable(logInButton));
		//logInButton.click();

		// verifications
		// new url	
		//String expectedUrl = "http://the-internet.herokuapp.com/secure";
		Assert.assertEquals(secureAreaPage.getCurrentUrl(), secureAreaPage.getCurrentUrl());

		// log out button is visible
		Assert.assertTrue(secureAreaPage.isLogOutBttonVisible(),"logout Button is not visible");
				//"logOutButton is not visible.");

		// Successful log in message
		String expectedSuccessMessage = "You logged into a secure area!";
		String actualSuccessMessage = driver.findElement(By.id("flash")).getText();
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
				"actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
						+ expectedSuccessMessage + "\nactualSuccessMessage: " + actualSuccessMessage);

	}
}
