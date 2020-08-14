package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sibi\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");

        String sayfaBasligi = driver.getTitle(); // Car
        // contains methodu bir yazinin icerisninde bir kelime grubunun gecip gecmedigini kontrol eder
        if(sayfaBasligi.contains("Books")){
            System.out.println("Books kelimesi geciyor." );
        }else {
            System.out.println("Books kelimesi geçmiyor.");
        }

        driver.quit();

    }

}
