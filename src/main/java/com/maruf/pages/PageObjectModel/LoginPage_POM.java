package com.maruf.pages.PageObjectModel;

import com.maruf.base.CommonToAllPage;
import com.maruf.utils.PropertyReader;
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

    public String loginToVWOInvalidCreds(){

        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password,"admin");
        clickElement(signIn);
        presenceOfElement(error_msg);
        visibilityOfElement(error_msg);
        return getElement(error_msg).getText();



    }

     public void loginToVWOvalidCreds(){

        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElement(signIn);

    }



    public DashboardPage_POM afterLoginVWOValidCreds(){
        return new DashboardPage_POM();
    }








}
