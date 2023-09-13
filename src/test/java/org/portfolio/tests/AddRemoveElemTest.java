package org.portfolio.tests;

import org.portfolio.models.AddRemoveElementsPage;
import org.portfolio.models.WelcomePage;
import org.portfolio.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElemTest extends BaseTest {

    @Test
    public void testAddElement() {
        AddRemoveElementsPage addRemoveElementsPage = new WelcomePage(getDriver())
                .clickAddRemoveElemPageLink()
                .clickAddElementButton();

        Assert.assertTrue(addRemoveElementsPage.isDeleteButtonPresent());
        Assert.assertEquals(addRemoveElementsPage.numberOfDeleteButtons(), 1);
    }

    @Test
    public void testAddTenElements() {
        AddRemoveElementsPage addRemoveElementsPage = new WelcomePage(getDriver())
                .clickAddRemoveElemPageLink()
                .clickAddElementButton10();

        Assert.assertEquals(addRemoveElementsPage.numberOfDeleteButtons(), 10);
    }

    @Test
    public void testDeleteElement() {
        AddRemoveElementsPage addRemoveElementsPage = new WelcomePage(getDriver())
                .clickAddRemoveElemPageLink()
                .clickAddElementButton()
                .clickDeleteButton();

        Assert.assertEquals(addRemoveElementsPage.numberOfDeleteButtons(), 0);
    }
}
