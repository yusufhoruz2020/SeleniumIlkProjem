package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        // Java projemize , chromedriver'i tanittik
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sibi\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

       //selenium ile ilgili ilk kodumuz
        // chrome ve driver neesnsesi olusturarak chrome driveri kullanilabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();

        // driver iniza google.com a gitmesini söyledik
        webDriver.get("https://google.com");
        // driver imizla acik olan pencereyi kapatir.
        //webDriver.close();


        // driverimizi komple kapatiyor
        webDriver.quit();



    }






}
