package org.portfolio.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.portfolio.models.base.BasePage;

import java.util.List;

public class BrokenImagesPage extends BasePage {

    @FindBy(xpath = "//img[1]")
    private WebElement picture1;
    @FindBy(xpath = "//div/img[1]")
    private WebElement picture2;
    @FindBy(xpath = "//div/img[2]")
    private WebElement picture3;
    @FindBy(xpath = "//div/img[3]")
    private WebElement picture4;

    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    public int numberOfBrokenImages() {
        List<WebElement> images = getDriver().findElements(By.tagName("img"));

        int numberOfBrokenImages = 0;
        for(WebElement element : images) {
            if(!isPicturePresent(this, element)) {
                numberOfBrokenImages++;
            }
        }
        return numberOfBrokenImages;
    }

    public boolean isFirstPictureDisplayed() {
        return isPicturePresent(this, picture1);
    }

    public boolean isSecondPictureDisplayed() {
        return isPicturePresent(this, picture2);
    }

    public boolean isThirdPictureDisplayed() {
        return isPicturePresent(this, picture3);
    }

    public boolean isForthPictureDisplayed() {
        return isPicturePresent(this, picture4);
    }
}
