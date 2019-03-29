package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DragAndDropPage extends BasePage {

    private By columnA = By.id("column-a");
    private By columnB = By.id("column-b");

    public DragAndDropPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void dragAToB() {
        log.info("Perform drag and drop A column to B");
        performDragAndDrop(columnA, columnB);
    }

    public String getColumnAText() {
        String text = find(columnA).getText();
        log.info("Column A text: ");
        return text;
    }

    public String getColumnBText() {
        String text = find(columnB).getText();
        log.info("Column B text: ");
        return text;
    }
}
