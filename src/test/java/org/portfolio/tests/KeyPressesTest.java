package org.portfolio.tests;

import org.portfolio.models.WelcomePage;
import org.portfolio.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressesTest extends BaseTest {

    @Test
    public void testEnteredKeyValidation() {
        String enteringValue = "e".toUpperCase();

        String result = new WelcomePage(getDriver())
                .clickKeyPressesPageLink()
                .enterCharInInputField(enteringValue)
                .resultText();

        Assert.assertEquals(result, "You entered: " + enteringValue);
    }
}
