package com.bulain.activiti.it;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

import com.bulain.activiti.test.TestConst;
import com.bulain.common.dataset.DataSet;
import com.bulain.common.dataset.SeedDataSet;
import com.bulain.common.test.WebTestCase;

@SeedDataSet(file = TestConst.IT_DATA_INIT_COMMON_XML)
@DataSet(file = "it-data/init_groups.xml")
public class GroupIT extends WebTestCase {

    @Test
    public void testList() {
        List<WebElement> listTr;

        driver.get(baseUrl + "/group/list.action");
        driver.findElement(By.id("search_search_name")).clear();
        driver.findElement(By.id("search_search_name")).sendKeys("name_page");
        new Select(driver.findElement(By.id("search_search_type"))).selectByValue("INSTITUTION");
        driver.findElement(By.id("btn_search")).click();
        listTr = driver.findElements(By.xpath("id('list')/tbody/tr"));
        assertEquals(4, listTr.size());
        assertTrue(isElementPresent(By.id("btn_search")));

        driver.get(baseUrl + "/group/list.action");
        driver.findElement(By.id("search_search_name")).clear();
        new Select(driver.findElement(By.id("search_search_type"))).selectByValue("");
        driver.findElement(By.id("btn_search")).click();
        listTr = driver.findElements(By.xpath("id('list')/tbody/tr"));
        assertEquals(8, listTr.size());
        assertTrue(isElementPresent(By.id("btn_search")));
    }

    @Test
    public void testCreate() {
        driver.get(baseUrl + "/group/list.action");
        driver.findElement(By.id("lnk_new")).click();
        driver.findElement(By.id("create_group_name")).clear();
        driver.findElement(By.id("create_group_name")).sendKeys("group01");
        new Select(driver.findElement(By.id("create_group_type"))).selectByValue("ACCOUNT");
        driver.findElement(By.id("btn_create")).click();
        List<WebElement> listTr = driver.findElements(By.xpath("id('list')/tbody/tr"));
        assertEquals(9, listTr.size());
        assertTrue(isElementPresent(By.id("btn_search")));
    }

    @Test
    public void testUpdate() {
        driver.get(baseUrl + "/group/list.action");
        String xpath = String.format("//tr[td/text()='%s']/td/a[contains(@href,'edit.action')]", "name_101");
        driver.findElement(By.xpath(xpath)).click();
        driver.findElement(By.id("update_group_name")).clear();
        driver.findElement(By.id("update_group_name")).sendKeys("name_101-updated");
        new Select(driver.findElement(By.id("update_group_type"))).selectByValue("ACCOUNT");
        driver.findElement(By.id("btn_update")).click();
        assertTrue(isElementPresent(By.id("btn_search")));
    }

    @Test
    public void testShow() {
        driver.get(baseUrl + "/group/list.action");
        String xpath = String.format("//tr[td/text()='%s']/td/a[contains(@href,'show.action')]", "name_101");
        driver.findElement(By.xpath(xpath)).click();
        String name = driver.findElement(By.id("show_group_name")).getText();
        String type = driver.findElement(By.id("show_group_type")).getText();
        String description = driver.findElement(By.id("show_group_description")).getText();
        assertEquals("name_101", name);
        assertEquals("Account", type);
        assertEquals("", description);
    }

    @Test
    public void testDelete() {
        driver.get(baseUrl + "/group/list.action");
        String xpath = String.format("//tr[td/text()='%s']/td/a[contains(@href,'destroy.action')]", "name_101");
        driver.findElement(By.xpath(xpath)).click();
        if (!(driver instanceof HtmlUnitDriver)) {
            driver.switchTo().alert().accept();
            driver.switchTo().defaultContent();
        }
        List<WebElement> listTr = driver.findElements(By.xpath("id('list')/tbody/tr"));
        assertEquals(7, listTr.size());
        assertTrue(isElementPresent(By.id("btn_search")));
    }

}
