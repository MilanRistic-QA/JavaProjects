package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//      Zadatak2: Napraviti program koji će se ulogovati na wordpress POMOĆU KOLAČIĆA (cookies)
//      https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F
//      Password: Qwerty123     Username: mristicqa
public class P2Selenium2a {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //Od sada ću wdwait uvek deklarisati na početku kako bih ga kasnije koristio po potrebi
        driver.manage().window().maximize();

        driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
        /*WebElement usernameBox = driver.findElement(By.id("usernameOrEmail"));
        usernameBox.sendKeys("mristicqa");
        WebElement continueButton = driver.findElement(By.className("login__form-action"));
        continueButton.click();

        WebElement passwordBox = driver.findElement(By.id("password"));
            wdwait.until(ExpectedConditions.elementToBeClickable(passwordBox));
        passwordBox.sendKeys("Qwerty123");
        continueButton.click();*/

        //Sledi demonstacija kreiranja i slanja kukija
        Cookie Dragoljub = new Cookie("Dragoljub", "je napravio kolačić");
        driver.manage().addCookie(Dragoljub);
        //Praktična primena kukija
        Cookie loggedIn = new Cookie("wordpress_logged_in",
                "mristicqa%7C1738626299%7CsnEp8vGSniT9xQiNQLtqDsRmPxsiO9B7VrkmorPXUOI%7C4368428a3fc65560a9976b39f878c04c33e2cd14c25f9eb34772b5b0b64c8465");
        driver.manage().addCookie(loggedIn);
        driver.navigate().refresh(); //Refresh služi da bi sajt povukao promene
        WebElement continueAsUser = driver.findElement(By.className("continue-as-user__gravatar-link"));
        continueAsUser.click();

//        driver.manage().deleteAllCookies(); -Postoji opcija da se obrišu svi kolačići na kraju testiranja
//        driver.close();
//        driver.quit();
    }
}
