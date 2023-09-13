package org.portfolio.models.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    private WebDriver driver;
    private WebDriverWait wait5;
    private WebDriverWait wait2;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait5() {
        if(wait5 == null) {
            wait5 = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        }
        return wait5;
    }

    public WebDriverWait getWait2() {
        if(wait2 == null) {
            wait2 = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
        }
        return wait2;
    }

    public boolean isPicturePresent(BasePage basePage, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) basePage.getDriver();
        return (Boolean) executor.executeScript("return arguments[0].complete " +
                "&& typeof arguments[0].naturalWidth != \"undefined\" " +
                "&& arguments[0].naturalWidth > 0", element);
    }
}
