package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        driver.get("http://34.246.169.246:8080/");
        WebElement element1 = driver.findElement(By.name("j_username"));
        element1.sendKeys("hbaaqeil");
        WebElement element2 = driver.findElement(By.name("j_password"));
        element2.sendKeys("Hba@@--01");
        element1.submit();
        Thread.sleep(5000);

        Assert.assertEquals("Dashboard [Jenkins]", driver.getTitle());
    }
}
