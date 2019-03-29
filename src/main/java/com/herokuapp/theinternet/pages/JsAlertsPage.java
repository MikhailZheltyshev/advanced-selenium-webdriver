package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JsAlertsPage extends BasePage {

    By clickJsAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    By clickJsConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    By clickJsPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    By resultTextLocator = By.id("result");

    public JsAlertsPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openJsAlert() {
        log.info("Clicking on [JS Alert Button]");
        click(clickJsAlertButton);
    }

    public void openJsConfirm() {
        log.info("Clicking on [JS Confirm Button]");
        click(clickJsConfirmButton);
    }

    public void openJsPrompt() {
        log.info("Clicking on [JS Prompt Button]");
        click(clickJsPromptButton);
    }

    public String getAlertText() {
        log.info("Getting text from alert");
        Alert alert = switchToAlert();
        return alert.getText();
    }

    public void acceptAlert() {
        log.info("Accepting alert");
        switchToAlert().accept();
    }

    public void dismissAlert() {
        log.info("Dismissing alert");
        switchToAlert().dismiss();
    }

    public void typeTextIntoAlert(String text) {
        log.info("Typing text '" + text + "' to alert");
        Alert alert = switchToAlert();
        alert.sendKeys(text);
        alert.accept();

    }

    public String getResultText() {
        String result = find(resultTextLocator).getText();
        log.info("Result text: " + result);
        return result;
    }






}
