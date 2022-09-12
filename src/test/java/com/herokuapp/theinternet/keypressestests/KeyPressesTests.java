package com.herokuapp.theinternet.keypressestests;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.KeyPressesPage;


public class KeyPressesTests extends TestUtilities {
	
@Test	
	public void PressKeyTests() {
		log.info("Starting PressKey Test");

		
		KeyPressesPage keypressesPage = new KeyPressesPage(driver, log);
		keypressesPage.openPage();
		
		
		keypressesPage.pressKey(Keys.ENTER);
		
		String result = keypressesPage.getResultText(); 
		
		Assert.assertTrue(result.equals("You entered: ENTER"), "Result is not expected");
	}	
	
@Test //This one use action method in basepageObject
	public void PressKeywithActionTests() {
	log.info("Starting Press Key with Action Test");
	
	KeyPressesPage keypressesPage = new KeyPressesPage(driver, log);
	keypressesPage.openPage();
	
	
	keypressesPage.pressKey(Keys.SPACE);
	
	String result = keypressesPage.getResultText(); 
	
	Assert.assertTrue(result.equals("You entered: SPACE"), "Result is not expected");
	
	}
}
