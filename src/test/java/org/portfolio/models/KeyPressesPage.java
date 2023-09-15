package org.portfolio.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.portfolio.models.base.BasePage;

public class KeyPressesPage extends BasePage {

    @FindBy(id = "target")
    private WebElement inputField;
    @FindBy(id = "result")
    private WebElement result;

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    public KeyPressesPage enterCharInInputField(String character) {
        inputField.sendKeys(character);
        return this;
    }

    public String resultText() {
        return result.getText();
    }
}
