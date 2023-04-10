package DataDriven;

import TestNG.dataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyLogin extends LoginScenario{

public static WebDriver driver;
@Test(priority = 1)
public void launchBrowser(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.saucedemo.com/");

}

   @Test (priority = 2,dataProvider = "Test1")
    public void execute(String Scenario, String Username, String Password) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("login-button")).click();
        if(Scenario.equalsIgnoreCase("Valid credentials")){
            WebElement Title = driver.findElement(By.cssSelector(".title"));
            Assert.assertTrue(Title.isDisplayed(),"Logged in successfully");
            System.out.println("Logged in successfully");
            driver.findElement(By.id("react-burger-menu-btn")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("logout_sidebar_link")).click();
        }
        else if (Scenario.equalsIgnoreCase("Invalid credentials")) {
            String message = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
            Assert.assertEquals(message, "Epic sadface: Sorry, this user has been locked out.");
            System.out.println(message);
        }
        //System.out.println(Scenario+" | "+Username+" | "+Password);
    }
}
