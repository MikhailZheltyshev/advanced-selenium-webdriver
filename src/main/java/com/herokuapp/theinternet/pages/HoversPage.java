package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HoversPage extends BasePage {
    private String pageUrl = "http://the-internet.herokuapp.com/hovers";

    private By avatarLocator = By.xpath("//div[@class='figure']");
    private By viewProfileLinkLocator = By.xpath(".//a[contains(text(), 'View profile')]");

    public HoversPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void open() {
        log.info("Opening Hovers page");
        openUrl(pageUrl);
        log.info("Hovers page opened");
    }

    public void openUserProfile(int i) {
        List<WebElement> avatars = findAll(avatarLocator);
        WebElement specificAvatar = avatars.get(i - 1);
        hoverOverElement(specificAvatar);
        specificAvatar.findElement(viewProfileLinkLocator).click();
    }
}
