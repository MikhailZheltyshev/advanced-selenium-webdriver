package com.herokuapp.theinternet.checkboxespagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.CheckboxesPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTests extends TestUtilities {

    @Test
    public void selectingTwoCheckboxesTest() {
        // Open welcome page
        log.info("Starting selectingTwoCheckboxesTest");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.open();
        // Click on Checkboxes link
        CheckboxesPage checkboxesPage = welcomePage.clickCheckboxesLink();
        // Select all checkboxes
        checkboxesPage.selectAllCheckBoxes();
        // Verify all checkboxes are checked
        Assert.assertTrue(checkboxesPage.areAllCheckBoxesSelected(), "Failed to check all checkboxes!");
    }
}
