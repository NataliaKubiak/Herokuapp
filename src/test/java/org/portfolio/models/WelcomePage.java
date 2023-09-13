package org.portfolio.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.portfolio.models.base.BasePage;

public class WelcomePage extends BasePage {

    @FindBy(xpath = "//a[@href='/add_remove_elements/']")
    private WebElement addRemoveElementsLink;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public AddRemoveElementsPage clickAddRemoveElemLink() {
        addRemoveElementsLink.click();
        return new AddRemoveElementsPage(getDriver());
    }
}
