package com.maruf.tests;

import com.maruf.pages.PageObjectModel.LoginPage_POM;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLoginPOM {


    private static final Logger log = LoggerFactory.getLogger(TestVWOLoginPOM.class);

    @Test
    public void testLoginNegative() throws InterruptedException {

        LoginPage_POM loginPagePom = new LoginPage_POM();
        String error_msgText = loginPagePom.loginToVWOInvalidCreds();
        Assert.assertEquals(error_msgText, "Your email, password, IP address or location did not match");



    }
}
