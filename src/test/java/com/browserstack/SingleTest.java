package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        driver.get("http://54.76.177.255/forms/");
        WebElement element1 = driver.findElement(By.id("mobile"));
        element1.sendKeys("0565133578");
        WebElement element2 = driver.findElement(By.id("email"));
        element2.sendKeys("ahbaaqeil@gmail.com");
        WebElement element3 = driver.findElement(By.id("adult1-f"));
        element3.sendKeys("Hassan");
        WebElement element4 = driver.findElement(By.name("adult1-l"));
        element4.sendKeys("Baaqeil");
        element1.submit();
        Thread.sleep(5000);
        String titleMsg = driver.getTitle().substring(0,22)
        Assert.assertEquals("Form Successfully Sent", titleMsg);
    }
}
