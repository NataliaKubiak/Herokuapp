package org.portfolio.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.portfolio.models.base.BasePage;

public class DragAndDropPage extends BasePage {

    @FindBy(id = "column-a")
    private WebElement firstSquare;
    @FindBy(id = "column-b")
    private WebElement secondSquare;

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public String getSecondSquareHeader() {
        return secondSquare.getText();
    }

    public DragAndDropPage dragAndDropFirstSquareToSecondSquare() {
        new Actions(getDriver())
                .dragAndDrop(firstSquare, secondSquare)
                .pause(500)
                .perform();

        return this;
    }
}
