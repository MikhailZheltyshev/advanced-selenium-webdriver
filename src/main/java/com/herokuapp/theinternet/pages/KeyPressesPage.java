package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends BasePage {

    private By keyPressResultLocator = By.id("result");
    private By bodyLocator = By.xpath("//body");

    public KeyPressesPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void pressKey(Keys key) {
        log.info("Pressing key: " + key.name());
        pressKey(bodyLocator, key);
    }

    public void pressKeyWithAction(Keys key) {
        log.info("Pressing key: " + key.name());
        pressKeyWithAction(key);
    }

    public String getResultText() {
        String result = find(keyPressResultLocator).getText();
        log.info("Result text: " + result);
        return result;
    }
}
