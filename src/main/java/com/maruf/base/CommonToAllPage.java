package com.maruf.base;

import com.maruf.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.maruf.driver.DriverManager.getDriver;

public class CommonToAllPage {

    public CommonToAllPage() {
        // Constructor logic can go here
    }

    public void openVWOLoginURL() {
        getDriver().get("https://app.vwo.com");
    }

    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }

    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);
    }

    public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    public WebElement getElement(By key) {
        return getDriver().findElement(key);
    }
}
