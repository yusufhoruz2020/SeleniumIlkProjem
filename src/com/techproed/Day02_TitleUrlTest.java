package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {


    // youtube.com a gidelim
    // title "video" kelimesini iceriyor  mu bakalim
    // driveri kapatalim


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sibi\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();

        if(youtubeTitle.toLowerCase().contains("video")){
            System.out.println("video kelimesi var." );
        }else {
            System.out.println("video kelimesi yok.");
        }




        driver.quit();


    }


}
