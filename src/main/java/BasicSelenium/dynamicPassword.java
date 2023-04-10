package BasicSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class dynamicPassword {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String password = getPassword();
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
        //driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.cssSelector(".submit.signInBtn")).click();

    }
    public static String getPassword() throws InterruptedException {
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div button:nth-child(2)")).click();
        Thread.sleep(2000);
        String password = driver.findElement(By.cssSelector(".infoMsg")).getText();
        String[] passwordArray = password.split("'");
        String expectedPassword = passwordArray[1].split("'")[0];
        System.out.println(expectedPassword);
        return expectedPassword;
    }
}
