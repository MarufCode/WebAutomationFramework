package com.maruf.tests;

import com.maruf.basetest.CommonToAllTest;
import com.maruf.pages.PageObjectModel.LoginPage_POM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLoginPOMBaseTest extends CommonToAllTest {

    @Test
    public void testLoginNegative() {
        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        String error_msgText = loginPagePom.loginToInvalidCreds();
        Assert.assertEquals(error_msgText, "Your email, password, IP address or location did not match");
    }
}
