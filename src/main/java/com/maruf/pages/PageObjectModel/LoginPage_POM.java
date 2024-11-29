package com.maruf.pages.PageObjectModel;

import com.maruf.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage_POM extends CommonToAllPage {


    public LoginPage_POM() {
       super();
    }


    // PAGE LOCATORS

    By username = By.id("login-username");

    By password = By.id("login-password");

    By signIn = By.id("js-login-btn");

    By error_msg = By.id("js-notification-box-msg");



    // PAGE ACTIONS

    public String loginToInvalidCreds(){

        enterInput(username, "admin");
        enterInput(password, "admin");
        clickElement(signIn);
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return getElement(error_msg).getText();


    }







}
