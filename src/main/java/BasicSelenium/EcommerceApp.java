package BasicSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class EcommerceApp {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};
        List <WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for(int i=0;i<products.size();i++){
            String[] productName = products.get(i).getText().split("-");
            String formattedName = productName[0].trim();
            List itemNeededList = Arrays.asList(itemsNeeded);
            int j = 0;
            if(itemNeededList.contains(formattedName)) {
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                j++;
            }
            if(j==itemsNeeded.length){
                break;
            }
        }
    }
}
