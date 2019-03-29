package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {

    private By choseFileFieldLocator = By.id("file-upload");
    private By uploadButtonLocator = By.id("file-submit");
    private By uploadedFilesLocator = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void pushUploadButton() {
        log.info("Clicking on upload button");
        click(uploadButtonLocator);
    }

    public void selectFile(String fileName) {
        log.info("Selecting file " + fileName + " to upload");
        String filePath = System.getProperty("user.dir") + "//src//main//resources//" + fileName;
        type(filePath, choseFileFieldLocator);
        log.info("File selected");
    }

    public String getUploadedFileName() {
        String name = find(uploadedFilesLocator).getText();
        log.info("Uploaded file name: " + name);
        return name;
    }
}
