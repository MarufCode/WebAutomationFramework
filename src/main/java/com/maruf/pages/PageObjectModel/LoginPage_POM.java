package com.maruf.pages.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage_POM {
    WebDriver driver;

    public LoginPage_POM() {
        driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
    }


    // PAGE LOCATORS

    By username = By.id("login-username");

    By password = By.id("login-password");

    By signIn = By.id("js-login-btn");

    By error_msg = By.id("js-notification-box-msg");




    // PAGE ACTIONS

    public String loginToInvalidCreds() throws InterruptedException {

        driver.findElement(username).sendKeys("admin");
        driver.findElement(password).sendKeys("admin");
        driver.findElement(signIn).click();
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return driver.findElement(error_msg).getText();


    }







}
