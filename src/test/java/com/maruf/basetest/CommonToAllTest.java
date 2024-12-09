package com.maruf.basetest;

import com.maruf.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {


    // TO call the start the webdriver
    // Down the webdriver





    // Who will start the webdriver?

    @BeforeMethod
    public void setup(){
        DriverManager.init();
    }



    // Browser will close from here

    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }



    public void testPrint(){
        System.out.println("HI I am from base");
    }





}
