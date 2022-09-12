package com.herokuapp.theinternet.windowstests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.NewWindowPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import com.herokuapp.theinternet.pages.WindowsPage;

public class WindowsTests extends TestUtilities{

	@Test
	public void newWindowsTests() {
		log.info("Starting newWindows test");
		//open Welcome page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();
		//click on link
		WindowsPage windowsPage = welcomePage.clickMultipleWindowsLink();
		
		//click here link to new window
		windowsPage.openNewWindow();
		
		NewWindowPage newWindowPage = windowsPage.switchToNewWindowPage();
		
		String pageSource = newWindowPage.getCurrentPageSource();
		
		Assert.assertTrue(pageSource.contains("New Window"), "New page source doesnt not contain expected text" );
		
		
	}

}
