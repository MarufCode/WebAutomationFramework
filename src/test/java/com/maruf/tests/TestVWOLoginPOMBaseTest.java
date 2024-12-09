package com.maruf.tests;

import com.maruf.basetest.CommonToAllTest;
import com.maruf.pages.PageObjectModel.DashboardPage_POM;
import com.maruf.pages.PageObjectModel.LoginPage_POM;
import com.maruf.utils.PropertyReader;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWOLoginPOMBaseTest extends CommonToAllTest {



    public void testPrint(){
        System.out.println("HI I am TB- Method Overriding");
    }


    @Test(groups = {"smoke"}, priority = 1)
    public void testLoginNegative() {
        testPrint();
        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        String error_message = loginPagePom.loginToVWOInvalidCreds();

        // TestNG
        Assert.assertEquals(error_message, "Your email, password, IP address or location did not match");


        // AssertJ

        Assertions.assertThat(error_message)
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readKey("error_message"));
    }
    @Test(groups = {"smoke"}, priority = 2)
    public void testLoginPositive() {
        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        loginPagePom.loginToVWOvalidCreds();
        DashboardPage_POM dashboardPagePom = loginPagePom.afterLoginVWOValidCreds();
        String expected_username = dashboardPagePom.loggedInUserName();
        Assert.assertEquals(expected_username, PropertyReader.readKey("expected_username"));

    }
}