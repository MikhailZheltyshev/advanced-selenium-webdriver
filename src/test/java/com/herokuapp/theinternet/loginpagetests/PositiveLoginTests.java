package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.SecureAreaPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTests extends TestUtilities {

    @Test
    public void logInTest() {
        log.info("Starting logIn test");

        // open main page
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.open();
        log.info("Main page is opened.");
        takeScreenshot("Welcome Page opened");

        // Click on Form Authentication link
        LoginPage loginPage = welcomePage.clickFormAuthenticationLink();
        takeScreenshot("Login Page opened");

        // Add new cookie
        Cookie ck = new Cookie("username","tomsmith","the-internet.herokuapp.com/", "/", null);
        loginPage.setCookie(ck);

        // log in with credentials
        SecureAreaPage secureAreaPage = loginPage.logIn("tomsmith", "SuperSecretPassword!");


        // Get cookies
        String username = secureAreaPage.getCookie("username");
        log.info("'username' cookie value: " + username);
        String session = secureAreaPage.getCookie("rack.session");
        log.info("'session' cookie value: " + session);


        // verifications
        // new url
        String expectedUrl = "http://the-internet.herokuapp.com/secure";
        Assert.assertEquals(secureAreaPage.getPageUrl(), expectedUrl);

        // log out button is visible
        Assert.assertTrue(secureAreaPage.IsLogOutButtonVisible(), "LogOut button is not visible!");

        // Successful log in message
        String expectedSuccessMessage = "You logged into a secure area!";
        String actualSuccessMessage = secureAreaPage.getSuccessLogInMessageText();
        takeScreenshot("Login Page Message opened");
        Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
                "actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
                        + expectedSuccessMessage + "\nactualSuccessMessage: " + actualSuccessMessage);
    }
}
