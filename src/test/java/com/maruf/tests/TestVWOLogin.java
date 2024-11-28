package com.maruf.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin {


    @Test
    public void testLoginNegative(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        String error_msgText = error_msg.getText();
        Assert.assertEquals(error_msgText, "Your email, password, IP address or location did not match");


        driver.quit();


    }
}
