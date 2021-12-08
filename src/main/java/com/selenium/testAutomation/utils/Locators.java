package com.selenium.testAutomation.utils;

import org.openqa.selenium.By;

public class Locators {

    public static String loginUrl = "http://demo.guru99.com/test/login.html";
    public static String loginUsername = "guru99";
    public static String loginPassword = "pass99";

    public static By email = By.xpath("//*[@id='email']");
    public static By password = By.xpath("//*[@id='password']");
    public static By loginButton = By.xpath("//*[@id='submit']");

}
