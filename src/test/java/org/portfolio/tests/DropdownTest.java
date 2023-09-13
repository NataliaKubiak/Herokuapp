package org.portfolio.tests;

import org.portfolio.models.WelcomePage;
import org.portfolio.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @Test
    public void testDropdownTextVerification() {
        String placeholderText = new WelcomePage(getDriver())
                .clickDropdownPageLink()
                .getDropdownPlaceholderText();

        Assert.assertEquals(placeholderText, "Please select an option");
    }

    @Test
    public void testIsOption1Selected() {
        boolean isOption1Selected = new WelcomePage(getDriver())
                .clickDropdownPageLink()
                .chooseOption1FromDropdownMenu()
                .isOption1Selected();

        Assert.assertTrue(isOption1Selected);
    }
}
