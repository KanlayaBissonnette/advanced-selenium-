package com.herokuapp.theinternet.fileuploadtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.FileUploaderPage;


public class FileUploaderTests extends TestUtilities{

	
	@Test
	public void imageUploadTests() {
		log.info("Starting imageupload Test");
	//open page
	FileUploaderPage fileUploaderPage = new FileUploaderPage(driver, log);
	fileUploaderPage.openPage();	
		
	//click file upload link
	String fileName = "xml.jpg";
	fileUploaderPage.selectFile(fileName);
	
	fileUploaderPage.pushUploadButton();
	
	String fileNames = fileUploaderPage.getUploadedFilesName();
		
	//verify upload
	Assert.assertTrue(fileNames.contains(fileName), "Our file ("+ fileName+ ") is not one of the uploaded (" + fileNames+")");
	}
}
