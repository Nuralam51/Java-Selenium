package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Execution Start");
        System.setProperty("webdriver.chrome.driver", "/home/nur/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/login.html");
        driver.manage().window().maximize();

        System.out.println("The page title is: " + driver.getTitle());

        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));

        email.sendKeys("guru99");
        password.sendKeys("pass99");
        loginButton.click();

        Thread.sleep(3000);

        System.out.println("Login success!");
        driver.quit();
        System.out.println("Execution Complete");
    }

}
