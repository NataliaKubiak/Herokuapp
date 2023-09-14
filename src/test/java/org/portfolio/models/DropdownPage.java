package org.portfolio.models;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    @FindBy(xpath = "//option[@value='2']")
    private WebElement option2;

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

    public DropdownPage chooseOption1FromDropdownMenuSELECT() {
        Select option1 = new Select(dropdownMenu);
        option1.selectByVisibleText("Option 1");
        return this;
    }

    public DropdownPage chooseOption1FromDropdownACTIONS() {
        new Actions(getDriver())
                .moveToElement(dropdownMenu)
                .click()
                .sendKeys("o")
                .sendKeys(Keys.ENTER)
                .perform();

        return this;
    }

    public boolean isOption1Selected() {
        return option1.isSelected();
    }

    public DropdownPage chooseOption2FromDropdownJSEXECUTOR() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].value='2'", dropdownMenu);
        return this;
    }

    public DropdownPage chooseOption2FromDropdownSENDKEYS() {
        dropdownMenu.sendKeys("Option 2");
        dropdownMenu.sendKeys(Keys.ENTER);

        return this;
    }

    public boolean isOption2Selected() {
        return option2.isSelected();
    }
}
