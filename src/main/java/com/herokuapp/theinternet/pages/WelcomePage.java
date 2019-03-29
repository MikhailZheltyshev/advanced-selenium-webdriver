package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {

    private String pageUrl = "http://the-internet.herokuapp.com/";

    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
    private By checkboxesLinkLocator = By.linkText("Checkboxes");
    private By dropdownLinkLocator = By.linkText("Dropdown");
    private By jsAlertsLinkLocator = By.linkText("JavaScript Alerts");
    private By multipleWindowsLinkLocator = By.linkText("Multiple Windows");
    private By iFrameLinkLocator = By.linkText("WYSIWYG Editor");
    private By keyPressesLinkLocator = By.linkText("Key Presses");
    private By fileUploadLinkLocator = By.linkText("File Upload");
    private By dragAndDropLinkLocator = By.linkText("Drag and Drop");


    public WelcomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void open() {
        log.info("Opening page: " + pageUrl + "...");
        openUrl(pageUrl);
        log.info("Page opened!");
    }

    public LoginPage clickFormAuthenticationLink() {
        log.info("Clicking Form Authentication Link on Welcome Page");
        click(formAuthenticationLinkLocator);
        return new LoginPage(driver, log);
    }

    public CheckboxesPage clickCheckboxesLink() {
        log.info("Clicking Checkboxes Link on Welcome Page");
        click(checkboxesLinkLocator);
        return new CheckboxesPage(driver, log);
    }

    public DropdownPage clickDropDownLink() {
        log.info("Clicking Dropdown Link on Welcome Page");
        click(dropdownLinkLocator);
        return new DropdownPage(driver, log);
    }

    public JsAlertsPage clickJsAlertsLink() {
        log.info("Clicking Dropdown Link on Welcome Page");
        click(jsAlertsLinkLocator);
        return new JsAlertsPage(driver, log);
    }

    public WindowsPage clickMultipleWindowsLink() {
        log.info("Clicking Multiple Windows Link on Welcome Page");
        click(multipleWindowsLinkLocator);
        return new WindowsPage(driver, log);
    }

    public IFramePage clickIFrameLink() {
        log.info("Clicking IFrame Link on Welcome Page");
        click(iFrameLinkLocator);
        return new IFramePage(driver, log);
    }

    public KeyPressesPage clickKeyPressesLink() {
        log.info("Clicking Key Presses Link on Welcome Page");
        click(keyPressesLinkLocator);
        return new KeyPressesPage(driver, log);
    }

    public FileUploadPage clickFileUploadLink() {
        log.info("Clicking File Upload Link on Welcome Page");
        click(fileUploadLinkLocator);
        return new FileUploadPage(driver, log);
    }

    public DragAndDropPage clickDragAndDropLink() {
        log.info("Clicking Drag And Drop Link on Welcome Page");
        click(dragAndDropLinkLocator);
        return new DragAndDropPage(driver, log);
    }
}
