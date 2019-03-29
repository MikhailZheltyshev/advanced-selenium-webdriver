package com.herokuapp.theinternet.hoverpagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.HoversPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends TestUtilities {

    @Test
    public void user2ProfileTest() {
        log.info("Starting userProfileTest");
        // Open Hovers page
        HoversPage hoversPage = new HoversPage(driver, log);
        hoversPage.open();
        // Click on View Profile link for second avatar
        hoversPage.openUserProfile(2);
        // Verify that opened URL is correct
        Assert.assertTrue(hoversPage.url().contains("/users/2"), "URL of opened page is not expected for user profile 2");
    }
}
