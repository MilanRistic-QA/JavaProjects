package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//Testirati funkcionalnost sajta https://petstore.octoperf.com/actions/Catalog.action
public class BasePage {
    public static void main(String[] args) {
        //U prvom testu ću testirati da li je tražena stranica online, odnosno da li smo došli na pravu stranicu
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
        WebElement Logo = driver.findElement(By.id("LogoContent"));
        WebElement mainImage = driver.findElement(By.id("MainImageContent")); //Big Bird at the center of the screen
        WebElement sidebarMenu = driver.findElement(By.id("SidebarContent"));

        Assert.assertTrue(Logo.isDisplayed());
        Assert.assertTrue(mainImage.isDisplayed());
        Assert.assertTrue(sidebarMenu.isDisplayed());

//        driver.close();
//        driver.quit();
    }
}
