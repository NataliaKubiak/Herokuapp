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
    public void testIsOption1SelectedSELECT() {
        boolean isOption1Selected = new WelcomePage(getDriver())
                .clickDropdownPageLink()
                .chooseOption1FromDropdownMenuSELECT()
                .isOption1Selected();

        Assert.assertTrue(isOption1Selected);
    }

    @Test
    public void testIsOption1SelectedACTIONS() {
        boolean isOption1Selected = new WelcomePage(getDriver())
                .clickDropdownPageLink()
                .chooseOption1FromDropdownACTIONS()
                .isOption1Selected();

        Assert.assertTrue(isOption1Selected);
    }

    @Test
    public void testOption2isSelectedJSEXECUTOR() {
        boolean isOption2Selected = new WelcomePage(getDriver())
                .clickDropdownPageLink()
                .chooseOption2FromDropdownJSEXECUTOR()
                .isOption2Selected();

        Assert.assertTrue(isOption2Selected);
    }

    @Test
    public void testOption2isSelectedSENDKEYS() {
        boolean isOption2Selected = new WelcomePage(getDriver())
                .clickDropdownPageLink()
                .chooseOption2FromDropdownSENDKEYS()
                .isOption2Selected();

        Assert.assertTrue(isOption2Selected);
    }
}
