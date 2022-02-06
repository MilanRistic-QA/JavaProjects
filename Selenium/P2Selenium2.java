package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

//      Zadatak2: Napraviti program koji će se ulogovati na wordpress i proveriti da li se korisnik ulogovao
//      https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F
//      Password: Qwerty123     Username: mristicqa
public class P2Selenium2 {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
        WebElement usernameBox = driver.findElement(By.id("usernameOrEmail"));
        usernameBox.sendKeys("mristicqa");
        WebElement continueButton = driver.findElement(By.className("login__form-action"));
        continueButton.click();
        //Thread.sleep(2000); //Eksplicitno čekanje
          WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10)); //Čekaj dok... a ne duže od 10s


        WebElement passwordBox = driver.findElement(By.id("password"));
        wdwait.until(ExpectedConditions.elementToBeClickable(passwordBox));
        passwordBox.sendKeys("Qwerty123");
        continueButton.click();
//        Thread.sleep(6500); //U testiranju slobodno koristite Thread.sleep ali na kraju obavezno zamenite sa wdwait

//        Počinje Utvrđivanje
//        wdwait.until(ExpectedConditions.urlToBe("String url")); Još jedan način upotrebe wdwaita
//        Nisam se opredelio da upoređujem URL zato što taj 'userHomePage' je kod različitih korisnika različit
        wdwait.until(ExpectedConditions.elementToBeClickable(By.className("masterbar__publish")));
        WebElement mySiteIcon = driver.findElement(By.cssSelector(".gridicon.gridicons-my-sites"));

        WebElement createNewPost = driver.findElement(By.className("masterbar__publish"));

        WebElement imgAvatar = driver.findElement(By.className("gravatar"));

        Assert.assertTrue(mySiteIcon.isDisplayed());
        Assert.assertTrue(createNewPost.isDisplayed());
        Assert.assertTrue(imgAvatar.isDisplayed());
        wdwait.until(ExpectedConditions.elementToBeClickable(imgAvatar));
        imgAvatar.click();
        wdwait.until(ExpectedConditions.elementToBeClickable(By.className("sidebar__me-signout")));
//        WebElement logout = driver.findElement(By.className
//                ("button sidebar__me-signout-button is-compact")); - Pošto ima razmake neće moći da pronađe
        WebElement logout = driver.findElement(By.cssSelector       //Pišemo cssSelector
                (".button.sidebar__me-signout-button.is-compact")); //i na početku stavljamo . i razmake zamenimo sa .
        Assert.assertTrue(logout.isDisplayed());
//       driver.close();
//       driver.quit();
    }
}
