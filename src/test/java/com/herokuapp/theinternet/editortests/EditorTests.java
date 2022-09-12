package com.herokuapp.theinternet.editortests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.EditorPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class EditorTests extends TestUtilities {

@Test
	public void defaultEditorTests() {
		log.info("Starting Editor Test");
	
	WelcomePage welcomePage = new WelcomePage(driver, log);
	welcomePage.openPage();
	
	
	//scroll to the buttom page
	welcomePage.scrollToButtom();
	
	
	EditorPage editorPage = welcomePage.clickWYSIWYGEditorLink();
	
	String EditorText = editorPage.getEditorText();
	
	Assert.assertTrue(EditorText.equals("Your content goes here."), "Editor default text is not expected");
	}
}
