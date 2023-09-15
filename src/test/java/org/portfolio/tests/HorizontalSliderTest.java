package org.portfolio.tests;

import org.portfolio.models.WelcomePage;
import org.portfolio.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testSliderMiddleValue() {
        String middleNumber = new WelcomePage(getDriver())
                .clickHorizontalSliderPageLink()
                .clickSlider()
                .getSliderNumber();

        Assert.assertEquals(middleNumber, "2.5");
    }

    @Test
    public void testMoveSliderByDragging() {
        String biggestNumber = new WelcomePage(getDriver())
                .clickHorizontalSliderPageLink()
                .moveSliderToTheRightSide()
                .getSliderNumber();

        Assert.assertEquals(biggestNumber, "5");
    }

    @Test
    public void testMoveSliderWithArrowButton() throws InterruptedException {
        String value = new WelcomePage(getDriver())
                .clickHorizontalSliderPageLink()
                .moveSliderWithRightArrowButton()
                .getSliderNumberWithVALUE();

        Assert.assertEquals(value, "3.5");
    }
}
