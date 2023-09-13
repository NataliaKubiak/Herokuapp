package org.portfolio.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.portfolio.models.base.BasePage;

import java.util.List;

public class AddRemoveElementsPage extends BasePage {

    @FindBy(xpath = "//button[@onclick='addElement()']")
    private WebElement addElementButton;
    @FindBy(className = "added-manually")
    private WebElement deleteButton;

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    public AddRemoveElementsPage clickAddElementButton() {
        addElementButton.click();
        return this;
    }

    public AddRemoveElementsPage clickAddElementButton10() {
        for (int i=0; i<10; i++) {
            addElementButton.click();
        }
        return this;
    }

    public boolean isDeleteButtonPresent() {
        return getWait5().until(ExpectedConditions.visibilityOf(deleteButton)).isDisplayed();
    }

    public int numberOfDeleteButtons() {
        List<WebElement> deleteButtons = getDriver().findElements(By.className("added-manually"));
        return deleteButtons.size();
    }
}
