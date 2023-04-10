package BasicSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DemoIframe {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        WebElement frame1 = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
    }
}
