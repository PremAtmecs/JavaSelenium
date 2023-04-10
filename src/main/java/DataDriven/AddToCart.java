package DataDriven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class AddToCart extends MultipleProducts{

    public static WebDriver driver;
    public static WebDriverWait wait;
    public AddToCart(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 5);
    }
    @Test(priority = 1)
    public void launchBrowser(){
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @Test(priority = 2,dataProvider = "Test1")
    public void products(String Product){
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
        for(int i=0;i<products.size();i++){
            String[] productName = products.get(i).getText().split("-");
            String formattedName = productName[0].trim();
            int j = 0;
            if(Product.contains(formattedName)) {
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                j++;
            }

            if(j==Product.length()){
                break;
            }
        }
//        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        System.out.println(Product);
    }
    @Test(priority = 3)
    public void clickCartIcon(){
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
    }

}
