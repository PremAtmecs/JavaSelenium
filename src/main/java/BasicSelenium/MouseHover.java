package BasicSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MouseHover {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
        driver.manage().window().maximize();
        WebElement ele = driver.findElement(By.xpath("//button[@class='dropbtn']"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
        int total_count = links.size();
        for (int i=0;i<total_count;i++){
            WebElement element = links.get(i);
            String text = element.getAttribute("innerHTML");
            System.out.println("Link name is" +text);
            if(text.equalsIgnoreCase("TestNG")){
                element.click();
                break;
            }

        }
        driver.close();
    }
}
