package com.herokuapp.theinternet.keypressestests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.KeyPressesPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressesTests extends TestUtilities {

    @Test
    public void keyPressesTest() {
        // Open welcome page
        log.info("Starting keyPressesTest");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.open();
        // Click on Key Presses Link
        KeyPressesPage keyPressesPage = welcomePage.clickKeyPressesLink();
        // Press key
        keyPressesPage.pressKey(Keys.ENTER);
        // Get result text
        String result = keyPressesPage.getResultText();
        // Verify result text is correct
        Assert.assertEquals(result, "You entered: ENTER", "Result text is incorrect!");
    }

    @Test
    public void keyPressesWithActionsTest() {
        // Open welcome page
        log.info("Starting keyPressesTest");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.open();
        // Click on Key Presses Link
        KeyPressesPage keyPressesPage = welcomePage.clickKeyPressesLink();
        // Press key
        keyPressesPage.pressKey(Keys.SPACE);
        // Get result text
        String result = keyPressesPage.getResultText();
        // Verify result text is correct
        Assert.assertEquals(result, "You entered: SPACE", "Result text is incorrect!");
    }
}
