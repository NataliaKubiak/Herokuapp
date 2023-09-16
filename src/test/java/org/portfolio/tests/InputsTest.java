package org.portfolio.tests;

import org.portfolio.models.WelcomePage;
import org.portfolio.tests.base.BaseTest;
import org.portfolio.tests.testData.TestData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class InputsTest extends BaseTest {

    @DataProvider(name = "allowedSymbol")
    public Object[][] provideAllowedSymbol() {
        return new Object[][] {
                {"1"}, {"2"}, {"3"}, {"4"}, {"5"},
                {"6"}, {"7"}, {"8"}, {"9"}
        };
    }

    @DataProvider(name = "allowedSymbolExcel")
    public Object[][] provideAllowedSymbolExcel() throws IOException {
        TestData testData = new TestData();

        return testData.retrieveTestData();
    }

    @DataProvider(name = "notAllowedSymbol")
    public Object[][] provideNotAllowedSymbol() {
        return new Object[][] {
                {"a"}, {"b"}, {"c"}, {"d"}, {"e"},
                {"f"}, {"g"}, {"h"}, {"i"}, {"e"},
                {"!"}, {"@"}, {"#"}, {"$"}, {"%"},
                {"^"}, {"<"}, {">"}, {"("}, {")"}
        };
    }

    @Test(dataProvider = "allowedSymbol")
    public void testInsertAllowedSymbol(String allowedSymbol) {
        String actualValue = new WelcomePage(getDriver())
                .clickInputsPageLink()
                .insertNumberInInputRow(allowedSymbol)
                .getInputValue();

        Assert.assertEquals(actualValue, allowedSymbol);
    }

    @Test(dataProvider = "allowedSymbolExcel")
    public void testInsertAllowedSymbolExcel(String allowedSymbolExcel) {
        String actualValue = new WelcomePage(getDriver())
                .clickInputsPageLink()
                .insertNumberInInputRow(allowedSymbolExcel)
                .getInputValue();

        Assert.assertEquals(actualValue, allowedSymbolExcel);
    }

    @Test(dataProvider = "notAllowedSymbol")
    public void testInsertChar(String notAllowedSymbol) {
        String actualValue = new WelcomePage(getDriver())
                .clickInputsPageLink()
                .insertNumberInInputRow(notAllowedSymbol)
                .getInputValue();

        Assert.assertEquals(actualValue, "");
    }
}
