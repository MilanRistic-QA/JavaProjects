package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Zadatak 1: Otići na Google, povećati prozor, odraditi refresh, otići na youTube, vratiti se nazad

public class P1Selenium1 {
    public static void main(String[] args) {
//    System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    driver.get("https://www.google.com/");
    driver.navigate().to("https://www.google.com/"); //drugi način kako da odete na neku stranicu
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().back();
        /*driver.navigate().forward();
        driver.navigate().refresh();*/


    }
}
