package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class FillFormAndSubmit extends BrowserStackTestNGTest {
    @BeforeMethod
    public void startBrowser() throws Exception {
        driver.get("http://54.76.177.255/forms/");
        WebElement element1 = driver.findElement(By.id("mobile"));
        element1.sendKeys("0565133578");
        WebElement element2 = driver.findElement(By.id("email"));
        element2.clear();
        element2.sendKeys("hbaaqeil@gmail.com");
        WebElement element3 = driver.findElement(By.id("adult1-f"));
        element3.sendKeys("Hassan");
        WebElement element4 = driver.findElement(By.name("adult1-l"));
        element4.sendKeys("Baaqeil");
        Thread.sleep(2000);
        element1.submit();
        Thread.sleep(2000);
    }
    
    @Test(description = "Sending booking data and submitting the form was successful! Assert1")
    public void test1() throws Exception {
       String titleMsg = driver.getTitle().substring(0,22);
        Assert.assertEquals("Form Successfully Sent", titleMsg);
    }        

    @Test(description = "Was first name correct?! Assert2")
    public void test2() throws Exception {
       String nameFirst = driver.findElement(By.id("adult1-f")).getAttribute("value");
        System.out.println("found this Name:" + nameFirst );
        Assert.assertEquals("Hassan", nameFirst);
    }   
    
    @Test(description = "Was correct 2nd name coorect! Assert3")
    public void test3() throws Exception {
       String nameLast = driver.findElement(By.id("adult1-l")).getAttribute("value");
        System.out.println("found this Name:" + nameLast );
        Assert.assertEquals("Baaqeil", nameLast);
    }   
   
}
