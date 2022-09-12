package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage extends BasePageObject {
	
	private String pageUrl ="http://the-internet.herokuapp.com/upload";
	
	private By chooseFileLinkLocator = By.xpath("/html//input[@id='file-upload']");
	private By uploadButtonLinkLocator = By.xpath("/html//input[@id='file-submit']");
	private By uploadedFilesLocator = By.id("uploaded-files");
	
	public FileUploaderPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void openPage() {
		log.info("Opening page:" + pageUrl);
		openUrl(pageUrl); 
		log.info("Page Opened!");
	}
	
	public void pushUploadButton() {
		log.info("Clicking Upload on File UploaderPage");
		click(uploadButtonLinkLocator);
	}


	public void selectFile(String fileName) {
		log.info("Select '"+ fileName +" ' file from resource");
		String filePath = System.getProperty("user.dir") + "/src/main/resources/file/" + fileName;
		type(filePath,chooseFileLinkLocator);
		log.info("File selected");	
	}

	public String getUploadedFilesName() {
		String names = find(uploadedFilesLocator).getText();
		log.info(names);
		//log.info("File Uploaded!:" + names );
		return names;
	}

}
