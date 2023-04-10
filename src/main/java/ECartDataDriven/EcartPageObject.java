package ECartDataDriven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EcartPageObject {
    public WebDriver driver;

    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    public void selectProduct(String product){
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
        for(int i=0; i<products.size();i++){
           String[] productName = products.get(i).getText().split("-");
           String formattedName =productName[0].trim();
           int j = 0;
           if(product.contains(formattedName)){
               driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
               j++;
           }
           if(j==product.length()){
               break;
           }

        }



    }

}
