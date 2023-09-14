package org.portfolio.tests;

import org.portfolio.models.DragAndDropPage;
import org.portfolio.models.WelcomePage;
import org.portfolio.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {

    @Test
    public void testDragAndDrop() {
        String secondSquareTextBefore = new WelcomePage(getDriver())
                .clickDragAndDropPageLink()
                .getSecondSquareHeader();

        String secondSquareTextAfter = new DragAndDropPage(getDriver())
                .dragAndDropFirstSquareToSecondSquare()
                .getSecondSquareHeader();

        Assert.assertEquals(secondSquareTextBefore, "B");
        Assert.assertEquals(secondSquareTextAfter, "A");
    }
}
