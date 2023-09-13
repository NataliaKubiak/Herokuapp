package org.portfolio.tests;

import org.portfolio.models.BrokenImagesPage;
import org.portfolio.models.WelcomePage;
import org.portfolio.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenImagesTest extends BaseTest {

    @Test
    public void testAmountOfBrokenImages() {
        BrokenImagesPage brokenImagesPage = new WelcomePage(getDriver())
                .clickBrokenImagesPageLink();

        Assert.assertEquals(brokenImagesPage.numberOfBrokenImages(), 2);
    }

    @Test
    public void testIsFirstPictureDisplayed() {
        boolean isFirstPictureDisplayed = new WelcomePage(getDriver())
                .clickBrokenImagesPageLink()
                .isFirstPictureDisplayed();

        Assert.assertTrue(isFirstPictureDisplayed);
    }

    @Test
    public void testIsSecondPictureDisplayed() {
        boolean isSecondPictureDisplayed = new WelcomePage(getDriver())
                .clickBrokenImagesPageLink()
                .isSecondPictureDisplayed();

        Assert.assertFalse(isSecondPictureDisplayed);
    }

    @Test
    public void testIsThirdPictureDisplayed() {
        boolean isThirdPictureDisplayed = new WelcomePage(getDriver())
                .clickBrokenImagesPageLink()
                .isThirdPictureDisplayed();

        Assert.assertFalse(isThirdPictureDisplayed);
    }

    @Test
    public void testIsForthPictureDisplayed() {
        boolean testIsForthPictureDisplayed = new WelcomePage(getDriver())
                .clickBrokenImagesPageLink()
                .isForthPictureDisplayed();

        Assert.assertTrue(testIsForthPictureDisplayed);
    }
}
