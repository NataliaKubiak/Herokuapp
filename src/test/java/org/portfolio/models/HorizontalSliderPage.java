package org.portfolio.models;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.portfolio.models.base.BasePage;

public class HorizontalSliderPage extends BasePage {

    @FindBy(xpath = "//input[@type='range']")
    private WebElement slider;
    @FindBy(id = "range")
    private WebElement sliderNumber;

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    public HorizontalSliderPage clickSlider() {
        slider.click();
        return this;
    }

    public String getSliderNumber() {
        return sliderNumber.getText();
    }

    public HorizontalSliderPage moveSliderToTheRightSide() {
        Actions actions = new Actions(getDriver());
        actions.clickAndHold(slider)
                .moveByOffset(200,200)
                .release()
                .pause(300)
                .perform();

        return this;
    }

    public HorizontalSliderPage moveSliderWithRightArrowButton() {
        Actions actions = new Actions(getDriver());
        actions.click(slider)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.ARROW_RIGHT)
                .perform();

        return this;
    }
}
