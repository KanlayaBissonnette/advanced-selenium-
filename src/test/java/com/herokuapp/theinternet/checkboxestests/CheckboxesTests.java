package com.herokuapp.theinternet.checkboxestests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.CheckboxesPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class CheckboxesTests extends TestUtilities{

	
	@Test
	public void selectingTwoCheckboxesTest() {
		log.info("Starting selectingTwoCheckboxes Test");
		
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();
		
	//click Checkboxes link
	CheckboxesPage checkboxesPage = welcomePage.clickCheckboxesLink();
	
	//Select all checkboxes
	checkboxesPage.selectAllCheckboxes();
		
	//verify if all checkboxes are checked
	Assert.assertTrue(checkboxesPage.areAllCheckboxesChecked(),"not all checkboxes are checked");
	}
}
