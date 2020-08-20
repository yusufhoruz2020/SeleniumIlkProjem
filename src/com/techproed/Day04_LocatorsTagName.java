package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsTagName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sibi\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS );
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // id , name, className, linkText, partialLinkText

        WebElement homeLink = driver.findElement(By.tagName("a")); // Home
        System.out.println(homeLink.getText());









    }




}
