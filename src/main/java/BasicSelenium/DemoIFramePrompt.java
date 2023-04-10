package BasicSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DemoIFramePrompt {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        WebElement frame1 = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(4000);
        driver.switchTo().alert().sendKeys("prem");
        Alert alertOnPage = driver.switchTo().alert();
        alertOnPage.sendKeys("prem");
        alertOnPage.accept();
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
    }
}
