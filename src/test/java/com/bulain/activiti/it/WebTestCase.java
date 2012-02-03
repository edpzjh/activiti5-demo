package com.bulain.activiti.it;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bulain.common.dataset.SeedDataSet;
import com.bulain.common.test.ServiceTestCase;

@Ignore
@SeedDataSet(file="it-data/init_common.xml")
public class WebTestCase extends ServiceTestCase{
    protected WebDriver driver;
    protected String baseUrl;
    
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        baseUrl = "http://localhost:8082";
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }
    
    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
