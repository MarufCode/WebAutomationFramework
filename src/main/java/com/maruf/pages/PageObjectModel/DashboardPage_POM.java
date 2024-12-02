package com.maruf.pages.PageObjectModel;

import com.maruf.base.CommonToAllPage;
import org.openqa.selenium.By;



public class DashboardPage_POM extends CommonToAllPage {

    public DashboardPage_POM(){

    }

    // PAGE LOCATORS
    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");


    public String loggedInUserName(){
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }












    // PAGE ACTIONS

}
