package BasicSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandlingWindows {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/au/");
        driver.findElement(By.xpath("//body/div[@id='main']/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(3000);
        Set<String> windowHandle = driver.getWindowHandles();
        System.out.println(windowHandle);
        Iterator<String> iterator = windowHandle.iterator();
        String parentWindow = iterator.next();
        System.out.println(parentWindow);
        String childWindow = iterator.next();
        System.out.println(childWindow);
        driver.switchTo().window(childWindow);
        driver.findElement(By.name("UserFirstName")).sendKeys("prem");
        driver.findElement(By.name("UserLastName")).sendKeys("prem");

    }
}
