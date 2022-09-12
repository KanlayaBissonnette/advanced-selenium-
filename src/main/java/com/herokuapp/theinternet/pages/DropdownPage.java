package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePageObject {

	private By dropdown = By.id("dropdown");
	
	public DropdownPage(WebDriver driver, Logger log) {
		super(driver, log);
	}
	//click Dropdown link 
	public void selectOption(int i) {
		log.info("Select option" +i +"From dropdown");	
		WebElement dropdownElement = find(dropdown);
		Select dropdown = new Select(dropdownElement);
		//select option, there are 3 ways to select
		//#1: dropdown.selectByIndex(i);
		//#2: dropdown.selectByVisibleText("Option" + i);
		//#3 
		dropdown.selectByValue("" + i);
	}
	
	public String getSelectedOption() {
		WebElement dropdownElement = find(dropdown);
		Select dropdown = new Select(dropdownElement);
		String selectedOption = dropdown.getFirstSelectedOption().getText();
		log.info(selectedOption + "is selected in dropdown");
		return selectedOption;
	}
}
