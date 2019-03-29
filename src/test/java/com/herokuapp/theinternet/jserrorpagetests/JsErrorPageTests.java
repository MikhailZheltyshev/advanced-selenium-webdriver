package com.herokuapp.theinternet.jserrorpagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.JsErrorPage;
import org.openqa.selenium.logging.LogEntry;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class JsErrorPageTests extends TestUtilities {

    @Test
    public void jsErrorTest() {
        log.info("Starting jsErrorTest");
        SoftAssert softAssert = new SoftAssert();
        // Open JS Error Page
        JsErrorPage jsErrorPage = new JsErrorPage(driver, log);
        jsErrorPage.open();
        // Get JS logs
        List<LogEntry> logs = getBrowserLogs();
        // Verify there is no JS errors in browsers console
        for (LogEntry entry : logs) {
            if (entry.getLevel().toString().equals("SEVERE")) {
                softAssert.fail("Severe error: " + entry.getMessage());
            }
        }
        softAssert.assertAll();
    }
}
