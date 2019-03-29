package com.herokuapp.theinternet.horizontalsliderpagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.HorizontalSliderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends TestUtilities {

    @Test
    public void sliderTest() {
        log.info("Starting sliderTest");
        // Open Horizontal slider page
        HorizontalSliderPage horizontalSliderPage = new HorizontalSliderPage(driver, log);
        horizontalSliderPage.open();

        String value = "3.5";

        // Set slider's value
        horizontalSliderPage.setSliderTo(value);
        // Verify that correct value was set
        Assert.assertEquals(horizontalSliderPage.getSliderValue(), value, "Slider value is incorrect!");
    }
}
