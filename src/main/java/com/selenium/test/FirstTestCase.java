package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Execution Start");
        System.setProperty("webdriver.chrome.driver", "/home/nur/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

        System.out.println("The page title is : " + driver.getTitle());

        WebElement userName = driver.findElement(By.xpath("//*[@id='userName']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='login']"));

        userName.sendKeys("testuser");
        password.sendKeys("Password@123");
        loginButton.click();

        Thread.sleep(3000);

        try {
            WebElement logoutButton = driver.findElement(By.xpath("//*[@id='submit']"));

            if (logoutButton.isDisplayed()) {
                System.out.println("Login Successful.");
                logoutButton.click();
                System.out.println("Logout Successful");
            }
        } catch (Exception e) {
            System.out.println("Error to login");
        }

        driver.quit();
        System.out.println("Execution complete");
    }

}
