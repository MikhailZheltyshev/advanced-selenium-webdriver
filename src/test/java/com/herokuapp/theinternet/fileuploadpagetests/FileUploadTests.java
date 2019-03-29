package com.herokuapp.theinternet.fileuploadpagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.FileUploadPage;
import com.herokuapp.theinternet.pages.KeyPressesPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends TestUtilities {

    @Test(dataProvider = "files")
    public void fileUploadTest(int num, String fileName) {
        // Open Welcome Page
        log.info("Starting fileUploadTest #" + num + " for " + fileName);
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.open();
        // Click on File Upload Link
        FileUploadPage fileUploadPage = welcomePage.clickFileUploadLink();
        // Upload file
        fileUploadPage.selectFile(fileName);
        fileUploadPage.pushUploadButton();
        // Verify uploaded file name is correct
        Assert.assertEquals(fileUploadPage.getUploadedFileName(), fileName, "Uploaded file message is incorrect!");
    }
}
