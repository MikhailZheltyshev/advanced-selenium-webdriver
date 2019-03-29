package com.herokuapp.theinternet.draganddroppagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DragAndDropPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTests extends TestUtilities {

    @Test
    public void dragAToB() throws InterruptedException {
        // Open Welcome Page
        log.info("Starting dragAToB");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.open();
        // Click on Drag And Drop Link
        DragAndDropPage dragAndDropPage = welcomePage.clickDragAndDropLink();
        // Drag and Drop A column to B
        dragAndDropPage.dragAToB();
        // Verify text of columns
        String columnAText = dragAndDropPage.getColumnAText();
        Assert.assertEquals(columnAText, "B", "Column A text is unexpected!");

        String columnBText = dragAndDropPage.getColumnBText();
        Assert.assertEquals(columnBText, "A", "Column B text is unexpected!");
    }
}
