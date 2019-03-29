package com.herokuapp.theinternet.dropdowntests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DropdownPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends TestUtilities {

    @Test
    public void optionTwoTest() {
        // Open Welcome Page
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.open();
        // Click on Dropdown link
        DropdownPage dropdownPage = welcomePage.clickDropDownLink();
        // Select option 2
        dropdownPage.selectOption(2);
        // Verify option 2 is selected
        Assert.assertEquals(dropdownPage.getSelectedOption(), "Option 2");
    }
}
