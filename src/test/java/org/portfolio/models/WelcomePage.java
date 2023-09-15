package org.portfolio.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.portfolio.models.base.BasePage;

public class WelcomePage extends BasePage {

    @FindBy(xpath = "//a[@href='/add_remove_elements/']")
    private WebElement addRemoveElementsPageLink;
    @FindBy(linkText = "Broken Images")
    private WebElement brokenImagesPageLink;
    @FindBy(linkText = "Checkboxes")
    private WebElement checkboxesPageLink;
    @FindBy(linkText = "Dropdown")
    private WebElement dropdownPageLink;
    @FindBy(linkText = "Drag and Drop")
    private WebElement dragAndDropPageLink;
    @FindBy(linkText = "Horizontal Slider")
    private WebElement horizontalSliderPageLink;
    @FindBy(linkText = "Inputs")
    private WebElement inputsPageLink;
    @FindBy(linkText = "Key Presses")
    private WebElement keyPressesPageLink;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public AddRemoveElementsPage clickAddRemoveElemPageLink() {
        addRemoveElementsPageLink.click();
        return new AddRemoveElementsPage(getDriver());
    }

    public BrokenImagesPage clickBrokenImagesPageLink() {
        brokenImagesPageLink.click();
        return new BrokenImagesPage(getDriver());
    }

    public CheckboxesPage clickCheckboxesPageLink() {
        checkboxesPageLink.click();
        return new CheckboxesPage(getDriver());
    }

    public DropdownPage clickDropdownPageLink() {
        dropdownPageLink.click();
        return new DropdownPage(getDriver());
    }

    public DragAndDropPage clickDragAndDropPageLink() {
        dragAndDropPageLink.click();
        return new DragAndDropPage(getDriver());
    }

    public HorizontalSliderPage clickHorizontalSliderPageLink() {
        horizontalSliderPageLink.click();
        return new HorizontalSliderPage(getDriver());
    }

    public InputsPage clickInputsPageLink() {
        inputsPageLink.click();
        return new InputsPage(getDriver());
    }

    public KeyPressesPage clickKeyPressesPageLink() {
        keyPressesPageLink.click();
        return new KeyPressesPage(getDriver());
    }
}
