package com.herokuapp.theinternet.alertstests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.JsAlertsPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class JsAlertTests extends TestUtilities {

    @Test
    public void jsConfirmAlertTest() {
        SoftAssert softAssert = new SoftAssert();
        // Open welcome page
        log.info("Starting selectingTwoCheckboxesTest");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.open();
        // Click on JS Alerts Link
        JsAlertsPage jsAlertsPage = welcomePage.clickJsAlertsLink();
        // Click on JS Alert Button
        jsAlertsPage.openJsAlert();
        // Get alert text
        String alertMessage = jsAlertsPage.getAlertText();
        // Click OK button
        jsAlertsPage.acceptAlert();
        // Get Result text;
        String result = jsAlertsPage.getResultText();
        // Verifications
        // 1 - Alert text is expected
        softAssert.assertTrue(alertMessage.equals("I am a JS Alert"), "Alert message is unexpected.");

        // 2 - Result text is expected
        softAssert.assertTrue(result.equals("You successfuly clicked an alert"), "Result text is unexpected");
        softAssert.assertAll();
    }

    @Test
    public void jsDismissAlertTest() {
        SoftAssert softAssert = new SoftAssert();
        // Open welcome page
        log.info("Starting selectingTwoCheckboxesTest");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.open();
        // Click on JS Alerts Link
        JsAlertsPage jsAlertsPage = welcomePage.clickJsAlertsLink();
        // Click on JS Alert Button
        jsAlertsPage.openJsConfirm();
        // Get alert text
        String alertMessage = jsAlertsPage.getAlertText();
        // Click OK button
        jsAlertsPage.dismissAlert();
        // Get Result text;
        String result = jsAlertsPage.getResultText();
        // Verifications
        // 1 - Alert text is expected
        softAssert.assertTrue(alertMessage.equals("I am a JS Confirm"), "Alert message is unexpected.");

        // 2 - Result text is expected
        softAssert.assertTrue(result.equals("You clicked: Cancel"), "Result text is unexpected");
        softAssert.assertAll();
    }

    @Test
    public void jsPromptTest() {
        SoftAssert softAssert = new SoftAssert();
        // Open welcome page
        log.info("Starting selectingTwoCheckboxesTest");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.open();
        // Click on JS Alerts Link
        JsAlertsPage jsAlertsPage = welcomePage.clickJsAlertsLink();
        // Click on JS Alert Button
        jsAlertsPage.openJsPrompt();
        // Get alert text
        String alertMessage = jsAlertsPage.getAlertText();
        // Type text to prompt
        String text = "This is test!";
        jsAlertsPage.typeTextIntoAlert(text);
        // Get Result text;
        String result = jsAlertsPage.getResultText();
        // Verifications
        // 1 - Alert text is expected
        softAssert.assertTrue(alertMessage.equals("I am a JS prompt"), "Alert message is unexpected.");
        // 2 - Result text is expected
        softAssert.assertTrue(result.equals("You entered: " + text), "Result text is unexpected");
        softAssert.assertAll();
    }
}
