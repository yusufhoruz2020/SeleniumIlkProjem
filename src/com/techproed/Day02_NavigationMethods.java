package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sibi\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver= new ChromeDriver();


        //driver in tam ekrani kaplamasini sagliyor
        webDriver.manage().window().maximize();

        // driver a google.com a gitmesini söyledik
        webDriver.get("http://google.com");


        // get komutu ile ayni islemi yapiyor
        webDriver.navigate().to("http://amazon.com");



        //navigate().back(); komutu bir onceki sayfaya geri dönmeye yariyor
        webDriver.navigate().back();


        // navigate().forward() methodu geri geldigimiz sayfaya gitmemizi sagliyor,
        //Ornek: goog->amazona gittik-> amazondan google a geri geldik
        webDriver.navigate().forward();


        // navigate().refresh(); methodu sayfayi yenilemeye yariyor
        webDriver.navigate().refresh();
        webDriver.quit();
        //





    }


}
