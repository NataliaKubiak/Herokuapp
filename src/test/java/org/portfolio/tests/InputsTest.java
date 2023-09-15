package org.portfolio.tests;

import org.portfolio.models.WelcomePage;
import org.portfolio.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {

    @Test
    public void testInsertNumber() {
        String insertingValue = "4";

        String actualValue = new WelcomePage(getDriver())
                .clickInputsPageLink()
                .insertNumberInInputRow(insertingValue)
                .getInputValue();

        Assert.assertEquals(actualValue, insertingValue);
    }

    @Test
    public void testInsertChar() {
        String insertingChar = "t";

        String actualValue = new WelcomePage(getDriver())
                .clickInputsPageLink()
                .insertNumberInInputRow(insertingChar)
                .getInputValue();

        Assert.assertEquals(actualValue, "");
    }
}
