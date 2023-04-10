package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parentclass {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    public void test(){
        System.out.println("I am here");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("last execution");
    }
}
