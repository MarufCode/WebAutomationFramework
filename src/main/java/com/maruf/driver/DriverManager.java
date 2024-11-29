package com.maruf.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
      }


    public static void init(){
       if (driver == null){
           driver = new EdgeDriver();
       }
   }


    public static void down(){
       if(driver != null){
           driver.quit();
           driver = null;
       }

   }



}
