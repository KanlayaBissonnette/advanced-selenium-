package com.herokuapp.theinternet.DropdownTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DropdownPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class DropdownTests extends TestUtilities {

		@Test
		public void OptionTwoTest() {
			log.info("Starting OptionTwoTest");

			// open main page
			WelcomePage welcomePage = new WelcomePage(driver, log);
			welcomePage.openPage();
			

			// Click on Dropdown link
			DropdownPage dropdownPage = welcomePage.clickDropdownLink();
			
			//select option 2
			dropdownPage.selectOption(2);
			
			//Verify option selected
			String selectedOption = dropdownPage.getSelectedOption();
			Assert.assertTrue(selectedOption.equals("Option 2"), "Option 2 is not selected, but option -" + selectedOption);
			
			
	}

}
