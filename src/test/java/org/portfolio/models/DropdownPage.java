package org.portfolio.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.portfolio.models.base.BasePage;

public class DropdownPage extends BasePage {

    @FindBy(id = "dropdown")
    private WebElement dropdownMenu;
    @FindBy(xpath = "//option[@disabled='disabled']")
    private WebElement dropdownDefaultState;
    @FindBy(xpath = "//option[@value='1']")
    private WebElement option1;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public String getDropdownPlaceholderText() {
        return dropdownDefaultState.getText();
    }

    public DropdownPage clickDropdownMenu() {
        dropdownMenu.click();
        return this;
    }

    public DropdownPage chooseOption1FromDropdownMenu() {
        Select option1 = new Select(dropdownMenu);
        option1.selectByVisibleText("Option 1");
        return this;
    }

    public boolean isOption1Selected() {
        return option1.isSelected();
    }
}
