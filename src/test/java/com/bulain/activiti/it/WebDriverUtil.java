package com.bulain.activiti.it;

import org.openqa.selenium.WebDriver;

public class WebDriverUtil {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        WebDriverUtil.driver = driver;
    }
    
}
