package com.selenium.testAutomation.pages;

import com.selenium.testAutomation.utils.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver webDriver;

    By email = By.xpath("//*[@id='email']");
    By password = By.xpath("//*[@id='passwd']");
    By loginButton = By.xpath("//*[@id='SubmitLogin']");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterUsername(String mail) {
        webDriver.findElement(email).sendKeys(mail);
    }

    public void enterPassword(String pass) {
        webDriver.findElement(password).sendKeys(pass);
    }

    public void clickLoginBtn() {
        webDriver.findElement(loginButton).click();
    }

}
