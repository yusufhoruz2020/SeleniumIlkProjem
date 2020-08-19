package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sibi\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://facebook.com");

        String sayfaTitle = driver.getTitle();
        if(sayfaTitle.equals("facebook")){
            System.out.println("facebook kelimesi var." );
        }else {
            System.out.println("actual title : " +sayfaTitle);
        }

        String sayfaUrl = driver.getCurrentUrl();
        if(sayfaUrl.contains("facebook")) {
            System.out.println("facebook kelimesini iceriyor");
        }else {
            System.out.println(sayfaUrl);
        }
        driver.navigate().to("http://walmart.com");
        String walmartSB = driver.getTitle();
        if(walmartSB.contains("Walmart.com")) {
            System.out.println("Walmart.com iceriyor");
        }else {
            System.out.println(walmartSB);
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();

    }


}
