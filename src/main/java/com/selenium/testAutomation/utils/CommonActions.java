package com.selenium.testAutomation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonActions {

    WebDriver driver;

    public CommonActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnButton(By btn) {
        driver.findElement(btn).click();
    }
}
