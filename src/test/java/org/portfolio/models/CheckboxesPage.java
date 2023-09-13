package org.portfolio.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.portfolio.models.base.BasePage;

public class CheckboxesPage extends BasePage {

    @FindBy(xpath = "//input[@type='checkbox'][1]")
    private WebElement checkbox1;
    @FindBy(xpath = "//input[@type='checkbox'][2]")
    private WebElement checkbox2;

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public CheckboxesPage clickCheckbox1() {
        checkbox1.click();
        return this;
    }

    public CheckboxesPage clickCheckbox2() {
        checkbox2.click();
        return this;
    }

    public boolean isCheckbox1Selected() {
        return checkbox1.isSelected();
    }

    public boolean isCheckbox2Selected() {
        return checkbox2.isSelected();
    }
}
