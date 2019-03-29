package com.herokuapp.theinternet.windowspagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.NewWindowPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import com.herokuapp.theinternet.pages.WindowsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowsPageTests extends TestUtilities {

    @Test
    public void newWindowTest() {
        // Open welcome page
        log.info("Starting newWindowTest");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.open();
        // Click on Multiple Windows Link
        WindowsPage windowsPage = welcomePage.clickMultipleWindowsLink();
        // Click on Open New Window Link
        windowsPage.openNewWindow();
        // Switch to new window tab
        NewWindowPage newWindowPage = windowsPage.switchToNewWindow("New Window");
        String pageSource = newWindowPage.getCurrentPageSource();
        // Verification that new window page contains expected text in source
        Assert.assertTrue(pageSource.contains("New Window"), "New Window Page doesn't contain expected text in source!");
    }
}
