package BasicSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class locators {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(4000);
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Prem");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("prem@gmail.com");
        driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234567890");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div button:nth-child(2)")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        Thread.sleep(2000);
        driver.findElement(By.id("chkboxOne")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".submit.signInBtn")).click();
        System.out.println(driver.findElement(By.tagName("p")).getText());
        //driver.quit();
    }
}
