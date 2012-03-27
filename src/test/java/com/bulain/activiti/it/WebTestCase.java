package com.bulain.activiti.it;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;

import com.bulain.common.dataset.SeedDataSet;
import com.bulain.common.test.ServiceTestCase;

@SeedDataSet(file = "it-data/init_common.xml")
public abstract class WebTestCase extends ServiceTestCase {
    private static final String CHROME_DRIVER = "ChromeDriver";
    private static final String FIREFOX_DRIVER = "FirefoxDriver";
    private static final String INTERNET_EXPLORER_DRIVER = "InternetExplorerDriver";
    
    protected WebDriver driver;
    @Autowired
    protected String baseUrl;
    @Autowired
    private String webDriver;
    @Autowired
    private Long waitSeconds;
    
    @Before
    public void setUp() {
        driver = WebDriverUtil.getDriver();
        if (driver != null) {
            return;
        }
        if (INTERNET_EXPLORER_DRIVER.equalsIgnoreCase(webDriver)) {
            DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
            ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            driver = new InternetExplorerDriver(ieCapabilities);
        } else if (FIREFOX_DRIVER.equalsIgnoreCase(webDriver)) {
            driver = new FirefoxDriver();
        } else if (CHROME_DRIVER.equalsIgnoreCase(webDriver)) {
            driver = new ChromeDriver();
        } else {
            driver = new HtmlUnitDriver();
        }
        driver.manage().timeouts().implicitlyWait(waitSeconds, TimeUnit.SECONDS);
        WebDriverUtil.setDriver(driver);
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
