package BasicSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        WebElement src = driver.findElement(By.xpath(" //li[text()='Zend Framework in Action']"));
        WebElement desc = driver.findElement(By.xpath("//span[text()='History']"));
        actions.clickAndHold(src)
                .pause(Duration.ofSeconds(3))
                .moveToElement(desc)
                .pause(Duration.ofSeconds(3))
                .release()
                .pause(Duration.ofSeconds(3))
                .build()
                .perform();

    }
}
