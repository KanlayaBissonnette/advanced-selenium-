package com.herokuapp.theinternet.horizontalslidertests;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.HorizontalSliderPage;

public class HorizontalSliderTests extends TestUtilities{
	
	@Test
	public void sliderTests() throws InterruptedException {
		log.info("Starting Slider Test");
		
		//open page
		HorizontalSliderPage horizontalSliderPage = new HorizontalSliderPage(driver, log);
		horizontalSliderPage.openPage();
		
		
		//Set Slider value
		String value = "1.5";
		horizontalSliderPage.setSliderTo(value);
		Thread.sleep(1000);
		
		
		//verify slider value
		String sliderValue = horizontalSliderPage.getSliderValue();
		Assert.assertTrue(sliderValue.equals(value),"Range is not correct. It is:" + value);
		
		
		
		
		
		
		
		

	}

}
