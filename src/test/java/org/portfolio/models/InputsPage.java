package org.portfolio.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.portfolio.models.base.BasePage;

public class InputsPage extends BasePage {

    @FindBy(xpath = "//input")
    private WebElement inputRow;

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public InputsPage insertNumberInInputRow(String number) {
        inputRow.sendKeys(number);
        return this;
    }

    public String getInputValue() {
        return inputRow.getAttribute("value");
    }
}
