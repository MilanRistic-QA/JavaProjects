package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Fish {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Test1 - Sidebar button Fish
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        //Preduslov da se nalazimo na početnoj stranici
        WebElement sidebarFish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
        sidebarFish.click();


            WebElement title = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/h2"));
            String actualTitle = title.getText();
            String expectedTitle = "Fish";
            Assert.assertEquals(actualTitle, expectedTitle);
            WebElement firstProductId = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
            String actualId = firstProductId.getText();
            String expectedId = "FI-SW-01";
            Assert.assertEquals(actualId, expectedId);

        //Test2 - Quickbar button Fish
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        //Preduslov da se nalazimo na početnoj stranici
        WebElement quickBarFish = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img"));
        quickBarFish.click();

        //Promenljive su već deklarisane u prethodnom testu
        title = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/h2"));
        actualTitle = title.getText();
        expectedTitle = "Fish";
        Assert.assertEquals(actualTitle, expectedTitle);
        firstProductId = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
        actualId = firstProductId.getText();
        expectedId = "FI-SW-01";
        Assert.assertEquals(actualId, expectedId);

//Test3 - Picture of Fish area
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        //Preduslov da se nalazimo na početnoj stranici
        WebElement pictureOfFish = driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[2]"));
        pictureOfFish.click();

        //Promenljive su već deklarisane u prvom testu
        title = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/h2"));
        actualTitle = title.getText();
        expectedTitle = "Fish";
        Assert.assertEquals(actualTitle, expectedTitle);
        firstProductId = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
        actualId = firstProductId.getText();
        expectedId = "FI-SW-01";
        Assert.assertEquals(actualId, expectedId);


//        driver.close();
//        driver.quit();
    }
}
