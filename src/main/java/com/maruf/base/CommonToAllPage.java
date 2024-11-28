package com.maruf.base;

import com.maruf.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class CommonToAllPage {


    public CommonToAllPage() {

        // If you want to call something before every Page Object Class call, Put your Code here");
        // Open File, Open Data Base Connection You can write code here
    }



    public void clickElement(By by){
        DriverManager.driver.findElement(by).click();
    }


    public void enterInput(By by, String key) {
        DriverManager.driver.findElement(by).sendKeys(key);
    }


    // Wait Explicits Here

    public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(By elementLocation) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    public WebElement getElement(By key) {
        return DriverManager.getDriver().findElement(key);
    }










}
