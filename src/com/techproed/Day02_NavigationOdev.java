package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    // 1- ilk once google.com a gidiniz
    // 2- yotube.com a gidiniz
    // 3- google.com a back methodu ile dönünüz
    // 4- youtube.com a geri gidiniz
    // 5- yotube u yenileyiniz
    // 6- driver'i kapat

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sibi\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver= new ChromeDriver();
        webDriver.get("http://google.com");
        webDriver.navigate().to("http://youtube.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();

    }


}
