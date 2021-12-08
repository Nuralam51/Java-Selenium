package com.selenium.testAutomation.tests;

import com.selenium.testAutomation.base.DriverFactory;
import com.selenium.testAutomation.pages.LoginPage;
import com.selenium.testAutomation.utils.Locators;
import com.selenium.testAutomation.utils.TimeOut;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver webDriver;
    LoginPage loginPage;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get(Locators.loginUrl);
        webDriver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void verifyLogin() {
        loginPage = new LoginPage(webDriver);
        loginPage.enterUsername(Locators.loginUsername);
        loginPage.enterPassword(Locators.loginPassword);
        loginPage.clickLoginBtn();
    }

    @AfterTest
    public void driverDown() {
        TimeOut.timeout();
        webDriver.quit();
    }


}
