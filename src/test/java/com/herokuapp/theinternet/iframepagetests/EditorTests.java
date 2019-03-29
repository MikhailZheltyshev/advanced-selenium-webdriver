package com.herokuapp.theinternet.iframepagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.IFramePage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditorTests extends TestUtilities {

    @Test
    public void defaultEditorValueText() throws InterruptedException {
        // Open welcome page
        log.info("Starting defaultEditorValueText");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.open();
        // Scroll down to the link
        welcomePage.scrollToBottom();
        // Click on iFrame Editor Link
        IFramePage iFramePage = welcomePage.clickIFrameLink();
        // Get default editor text
        String defaultText = iFramePage.getEditorText();
        // Verify default text
        Assert.assertEquals(defaultText,"Your content goes here.","Text is not expected!");
    }
}
