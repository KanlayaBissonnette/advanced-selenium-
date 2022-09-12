package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DragAndDropPage extends BasePageObject {
	
	private String pageUrl = "http://the-internet.herokuapp.com/drag_and_drop";
	
	private By columnA = By.xpath("/html//div[@id='column-a']");
	private By columnB = By.xpath("/html//div[@id='column-b']");
	
	public DragAndDropPage(WebDriver driver, Logger log) {
		super(driver, log);
	
	}

	public void openPage() {
		log.info("Opening page:" + pageUrl);
		openUrl(pageUrl); 
		log.info("Page Opened!");
		
	}
	public void dragAtoB() {
		log.info("Drag and drop A box to B box");
		performDragAndDrop(columnA, columnB);
	
}
	public String getColumnAText() {
		String text = find(columnA).getText();
		log.info("column A text:" + text);
		return text;
	}


	public String getColumnBText() {
		String text = find(columnB).getText();
		log.info("column B text:" + text);
		return text;
	}

}
