package org.portfolio.tests;

import org.portfolio.models.WelcomePage;
import org.portfolio.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {

    @Test
    public void testIsCheckbox1Selected() {
        boolean isCheckbox1Selected = new WelcomePage(getDriver())
                .clickCheckboxesPageLink()
                .clickCheckbox1()
                .isCheckbox1Selected();

        Assert.assertTrue(isCheckbox1Selected);
    }

    @Test
    public void testIsCheckbox2Selected() {
        boolean isCheckbox2Selected = new WelcomePage(getDriver())
                .clickCheckboxesPageLink()
                .clickCheckbox2()
                .isCheckbox2Selected();

        Assert.assertFalse(isCheckbox2Selected);
    }
}
