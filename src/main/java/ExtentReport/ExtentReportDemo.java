package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReportDemo {
    public static WebDriver driver;
    ExtentReports extentReport;
    @BeforeTest
    public void config(){
        String path = System.getProperty("user.dir")+"\\reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation result");
        reporter.config().setDocumentTitle("Test Result");

        extentReport = new ExtentReports();
        extentReport.attachReporter(reporter);
        extentReport.setSystemInfo("Tester", "Premkumar");
    }

    @Test
    public void initialDemo(){
        ExtentTest test = extentReport.createTest("Initial Demo");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        extentReport.flush();
        test.fail("Result do not match");

    }
}
