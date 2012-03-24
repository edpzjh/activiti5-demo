package com.bulain.activiti.it;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.bulain.common.dataset.DataSet;

@DataSet(file = "it-data/init_groups.xml")
public class GroupIT extends WebTestCase {
    
    @Test
    public void testCreate() {
        driver.get(baseUrl + "/group/new.action");
        driver.findElement(By.id("create_group_name")).clear();
        driver.findElement(By.id("create_group_name")).sendKeys("group01");
        new Select(driver.findElement(By.id("create_group_type"))).selectByValue("ACCOUNT");
        driver.findElement(By.id("btn_create")).click();
        assertTrue(isElementPresent(By.id("btn_search")));
    }
}
