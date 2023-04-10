package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeLoan {
    @Test
    public void userDetails(){
        System.out.println("Getting user details");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method");
    }
    @Test(groups = {"smoke"})
    public void homeLoanDetails(){
        System.out.println("Getting home loan details");
    }
    int j=10;
    @Test
    public void constructionDetails(){
        //System.out.println("Value of construction");
        Assert.assertEquals(10, j);
    }
    @AfterSuite
    public void aSuite(){
        System.out.println("Final Execution");
    }
}
