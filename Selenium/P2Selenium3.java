package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

//Zadatak3: Ulogovati se na sajt https://demoqa.com preko kolačića,
//Izlogovati se i Assertovati-potvditi da je korisnik izlogovan

//      Password: Qwerty123!@#     Username: MRisticQA
public class P2Selenium3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
//        WebElement enterBookStore = driver.findElement(By.cssSelector("[h5='.Book.Store.Application']"));
//        Moguće da ne može da pronađe ovaj element pošto treba da skroluje skroz dole
//        !Uopšte ne može da se izabere nijedna od ovih 6 kartica ni preko (full)xpatha

//        Otvaram Inspect>>Application>Cookies; Manuelno se ulogujem
//        Uviđam da posle logovanja postoje na kartici Cookies nova četri kolačića
//        Testiranjem utvrđujem da su sva 4 potrebna da bi se korisnik ulogovao i normalno funkcionisao kao ulogovan
        Cookie userName = new Cookie ("userName","MRisticQA");
        Cookie userID = new Cookie ("userID", "8926585c-c522-494f-9ff7-15b9ca459dd3");
        Cookie expires = new Cookie ("expires", "2022-02-12T10%3A51%3A00.451Z");
        Cookie token = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Ik1yaXN0aWNRYSIsInBhc3N3b3JkIjoiUXdlcnR5MTIzIUAjIiwiaWF0IjoxNjQ0MDU4MjYwfQ.0nFp2yyo8TYn7Y7xhthK_jwJpTXPmOY_phdHwV6aClI");

        driver.manage().addCookie(userName);
        driver.manage().addCookie(userID);
        driver.manage().addCookie(expires);
        driver.manage().addCookie(token);

        driver.navigate().to("https://demoqa.com/books");
        WebElement LogOut = driver.findElement(By.id("submit"));
           Assert.assertTrue(LogOut.isDisplayed());
        LogOut.click();
        WebElement Login = driver.findElement(By.id("login"));
           Assert.assertTrue(Login.isDisplayed());
    }
}
