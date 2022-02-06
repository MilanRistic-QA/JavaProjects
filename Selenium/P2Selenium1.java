package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

//      Zadatak1: Otvoriti 3 taba, svaki tab treba da odlazi na poseban URL (po vašoj želji koji)
//                  Sačekati 2 sekunde u svakom tabu i zatvoriti sve tabove
public class P2Selenium1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
        js.executeScript("window.open()");

//        driver.getWindowHandles() nam je potreban kako bi identifikovali koji je koji tab
//        Tabovi su imenovani u formatu CDwindow-53B43B06EA74043C2B04BF28D06DEA44
        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());
//        Sva ta imena su smeštena u listu tabova
        driver.switchTo().window(listaTabova.get(1));
//        Prelazi na Tab pod brojem 1 (počinju od nule), naziv nije bitno da znamo već ga uzima iz liste.
        driver.navigate().to("https://docs.oracle.com/en/java/");

        driver.switchTo().window(listaTabova.get(2));
        driver.navigate().to("https://www.facebook.com");

        Thread.sleep(2000);
        driver.close(); //iako je sad treći tab zatvoren driver ipak mora da se prebaci manuelno na sledeći tab

        driver.switchTo().window(listaTabova.get(1));
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(listaTabova.get(0));
        Thread.sleep(2000);
        driver.close();

        driver.quit();
    }
}
