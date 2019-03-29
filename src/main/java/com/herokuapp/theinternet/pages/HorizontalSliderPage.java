package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage extends BasePage {

    private String pageUrl = "http://the-internet.herokuapp.com/horizontal_slider";

    private By rangeLocator = By.id("range");
    private By sliderLocator = By.tagName("input");

    public HorizontalSliderPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void open() {
        openUrl(pageUrl);
    }

    public void setSliderTo(String value) {
        log.info("Moving slider to " + value);
        // Not Working Approach for the current page
        /*int width = find(sliderLocator).getSize().getWidth();
        double percent = Double.parseDouble(value) / 5;
        int xOffset = (int) (width * percent);

        Actions action = new Actions(driver);
        action.dragAndDropBy(find(sliderLocator), xOffset, 0).build().perform();*/

        // Workaround
        int steps = (int) (Double.parseDouble(value) / 0.5);
        pressKey(sliderLocator, Keys.ENTER);
        for (int i = 0; i < steps; i++) {
            pressKey(sliderLocator, Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue() {
        return find(rangeLocator).getText();
    }
}
