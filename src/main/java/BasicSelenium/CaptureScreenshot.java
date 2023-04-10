package BasicSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();

        //Full page screenshot
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\screnshots\\homepage.png");
        FileUtils.copyFile(src, trg);

        //take screenshot of particular portion
        WebElement section = driver.findElement(By.xpath("//div[@class='products']"));
        File src1 = section.getScreenshotAs(OutputType.FILE);
        File trg1 = new File(".\\screnshots\\featured.png");
        FileUtils.copyFile(src1, trg1);

        //Take screenshot of particular element
        WebElement ele = driver.findElement(By.xpath("//div[@class='products']/div[@class='product'][1]"));
        File src2 = ele.getScreenshotAs(OutputType.FILE);
        File trg2 = new File(".\\screnshots\\element.png");
        FileUtils.copyFile(src2, trg2);

        driver.close();
    }
}
