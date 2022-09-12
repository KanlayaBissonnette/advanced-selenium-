package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class HorizontalSliderPage extends BasePageObject {
	//page url locator
	private String pageUrl = "https://the-internet.herokuapp.com/horizontal_slider";
	private By rangeLocator = By.id("range");
	private By sliderLocator = By.tagName("input");

	
	public HorizontalSliderPage(WebDriver driver, Logger log) {
		super(driver, log);
		
	}

	public void openPage() {
		log.info("Openning page:" + pageUrl);
		openUrl(pageUrl);
		log.info("Page Opened!");
		
	}

	public void setSliderTo(String value) throws InterruptedException {
		log.info("Moving slider to:" + value);

		//move slider normal method (not working)

//		double xoffset = Double.parseDouble(value);
//		System.out.println(xoffset);
		
//		Actions actions = new Actions(driver);
//		actions.dragAndDropBy(find(sliderLocator), (int)xoffset, 0).build().perform();
//		System.out.println(find(rangeLocator).getText());
//		
		
		
		
		
		int steps = (int) (Double.parseDouble(value) / 0.5); // 7

		// Perform steps
		presskey(sliderLocator, Keys.ENTER);
		for (int i = 1; i <= steps; i++) {
			presskey(sliderLocator, Keys.ARROW_RIGHT);
			Thread.sleep(1000);
		}
	}

	public String getSliderValue() {
		String rangeValue = find(rangeLocator).getText();
		log.info("Slider value is " + rangeValue);
		return rangeValue;
	}

}
