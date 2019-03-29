package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsPage extends BasePage{

    private By newWindowLinkLocator = By.linkText("Click Here");

    public WindowsPage(WebDriver driver, Logger log) {
        super(driver, log);
    }


    public void openNewWindow() {
        log.info("Openning New Window From Multiple Windows Page");
        click(newWindowLinkLocator);
    }

    public NewWindowPage switchToNewWindow(String windowTitle) {
        log.info("Looking for 'New Window' page");
        switchToWindowWithTitle(windowTitle);
        return new NewWindowPage(driver, log);
    }
}
