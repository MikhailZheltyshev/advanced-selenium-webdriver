package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage extends BasePage {

    private By defaultEditorsTextLocator = By.id("tinymce");
    private By frameLocator = By.tagName("iframe");

    public IFramePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public String getEditorText() {
        switchToFrame(frameLocator);
        String text = find(defaultEditorsTextLocator).getText();
        log.info("Text from Editor: " + text);
        return text;
    }
}
