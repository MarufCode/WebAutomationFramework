package com.maruf.base;

import com.maruf.driver.DriverManager;
import com.maruf.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.maruf.driver.DriverManager.getDriver;
//import static com.maruf.driver.DriverManagerTL.getDriver;

public class CommonToAllPage {

    public CommonToAllPage() {
        // Constructor logic can go here
    }

    public void openVWOLoginURL() {
        getDriver().get(PropertyReader.readKey("url"));
    }

    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }

    public void clickElement(WebElement element) {
        element.click();
    }


    public void enterInput(WebElement element, String key) {
        element.sendKeys(key);
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
