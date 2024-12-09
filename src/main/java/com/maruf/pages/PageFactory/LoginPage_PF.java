package com.maruf.pages.PageFactory;

import com.maruf.base.CommonToAllPage;
import com.maruf.pages.PageObjectModel.DashboardPage_POM;
import com.maruf.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF extends CommonToAllPage {

    WebDriver driver;

    public LoginPage_PF(WebDriver driver) {
       super();
        PageFactory.initElements(driver, this);
    }


    // PAGE LOCATORS



    @FindBy(id = "login-username")
            private WebElement username;


    @FindBy(id = "login-password")
            private WebElement password;


    @FindBy(id = "js-login-btn")
    private WebElement signIn;


    @FindBy(id = "js-notification-box-msg")
    private WebElement error_msg;




//    By username = By.id("login-username");

//    By password = By.id("login-password");

//    By signIn = By.id("js-login-btn");

//    By error_msg = By.id("js-notification-box-msg");



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
