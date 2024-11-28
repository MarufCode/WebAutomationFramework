package com.maruf.tests;

import com.maruf.pages.PageObjectModel.LoginPage_POM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLoginPOM {


    @Test
    public void testLoginNegative() throws InterruptedException {

        LoginPage_POM loginPagePom = new LoginPage_POM();
        String error_msgText = loginPagePom.loginToInvalidCreds();
        Assert.assertEquals(error_msgText, "Your email, password, IP address or location did not match");



    }
}
