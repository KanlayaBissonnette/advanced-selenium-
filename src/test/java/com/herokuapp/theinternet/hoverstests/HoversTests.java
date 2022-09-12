package com.herokuapp.theinternet.hoverstests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.HoversPage;


public class HoversTests extends TestUtilities{
@Test
	public void user2ProfileTests() {
			log.info("Starting user2Profile Test");

			HoversPage hoversPage = new HoversPage(driver, log);
			hoversPage.openPage();
			
			hoversPage.openUserProfile(2);
			
			Assert.assertTrue(hoversPage.getCurrentUrl().contains("/users/2"), "Url of openned is not expected");
		}
}
