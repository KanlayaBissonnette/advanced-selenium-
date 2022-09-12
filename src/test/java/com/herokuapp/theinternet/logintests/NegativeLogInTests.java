package com.herokuapp.theinternet.logintests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class NegativeLogInTests extends TestUtilities {
	

	@Parameters({ "username", "password", "expectedMessage" })
	@Test(priority = 1)
	public void negativeTest(String username, String password, String expectedErrorMessage) {
		log.info("Starting negativeTest");

		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();
		//String url = "http://the-internet.herokuapp.com/";
		//driver.get(url);
		//log.info("Main page is opened.");

		// Click on Form Authentication link
		LoginPage loginPage = welcomePage.clickFormAuthenticationLink();
		//driver.findElement(By.linkText("Form Authentication")).click();

		// enter username and password
		loginPage.negativeLogIn(username, password);
		//driver.findElement(By.id("username")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);

		// push log in button
		loginPage.waitForErrorMessage();
		String message = loginPage.getErrorMessageText();
		//driver.findElement(By.className("radius")).click();

		// Verification
		//String actualErrorMessage = driver.findElement(By.id("flash")).getText();
		Assert.assertTrue(message.contains(expectedErrorMessage),"Message does not contain Error text");
	}

}
