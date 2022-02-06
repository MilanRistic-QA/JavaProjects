package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// Zadatak2: Otići na sajt Wikipedia i pronaći članak o Nikoli Tesli

public class P1Selenium2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://sr.wikipedia.org/");
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
        searchBox.sendKeys("Nikola Tesla");
        Thread.sleep(2000);
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"searchform\"]/button"));
        searchButton.click(); //full Xpath: /html/body/div[1]/div/header/div[1]/div/div/form/button
//Prava suština testiranja je da mi utvrdimo da smo na pravoj stranici, da smo pronašli pravi element...
        String actualURL = driver.getCurrentUrl();
//        System.out.println(actualURL);
        String expectedURL = "https://sr.wikipedia.org/wiki/%D0%9D%D0%B8%D0%BA%D0%BE%D0%BB%D0%B0_%D0%A2%D0%B5%D1%81%D0%BB%D0%B0";
        Assert.assertEquals(actualURL, expectedURL);
//        Assert.assertNotEquals(actualURL, expectedURL); - Svaki vrlo dobar QA će proveriti i da li test pada
//        (Proces vraća exit code 1) ako u Assert stavimo assertNotEquals;

//        WebElement title = driver.findElement(By.xpath("//*[@id=\"firstHeading\"]"));
//        System.out.println(title.getText()); //title.getText() vraća tekst iz Elementa;
        String actualTitle = driver.findElement(By.id("firstHeading")).getText();
        String expectedTitle = "Никола Тесла";
        Assert.assertEquals(actualTitle, expectedTitle);

        WebElement picture = driver.findElement(By.xpath
                ("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[2]/td/a/img"));
        Assert.assertTrue(picture.isDisplayed());
//        Assert.assertFalse(picture.isDisplayed()); - posle proverimo da li test pada za suprotni uslov
        /* Radi preglednosti mi kao testeri možemo staviti sve Assertove na kraju:
        * Assert.assertEquals(actualURL, expectedURL);
        * Assert.assertEquals(actualTitle, expectedTitle);
        * Assert.assertTrue(picture.isDisplayed()); */
        driver.close(); //U toku testiranja ovo je zakomentarisano jer želimo da
        driver.quit(); //Verifikujemo da je program uradio ono što smo od njega tražili
    }
}
