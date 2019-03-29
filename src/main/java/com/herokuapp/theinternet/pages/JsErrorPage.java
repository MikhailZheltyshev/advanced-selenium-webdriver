package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class JsErrorPage extends BasePage {

    private String pageUrl = "http://the-internet.herokuapp.com/javascript_error";

    public JsErrorPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void open() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }
}
