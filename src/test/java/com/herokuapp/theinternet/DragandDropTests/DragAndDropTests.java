package com.herokuapp.theinternet.DragandDropTests;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DragAndDropPage;

public class DragAndDropTests extends TestUtilities{

@Test

	public void dragAnddropTests() {
		log.info("Starting Drag and Drop Test");
	
		//open page
	DragAndDropPage dragAndDropPage = new DragAndDropPage(driver, log);
	dragAndDropPage.openPage();
	
	// execute
	dragAndDropPage.dragAtoB();
	
	//verify
	String columnAText = dragAndDropPage.getColumnAText();
	Assert.assertTrue(columnAText.equals("B"), "Column A header should be B");
	
	String columnBText = dragAndDropPage.getColumnBText();
	Assert.assertTrue(columnBText.equals("A"), "Column B header should be A");
	
	
	}

}
