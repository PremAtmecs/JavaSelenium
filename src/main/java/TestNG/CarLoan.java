package TestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CarLoan {
    @Test(groups = {"smoke"})
    public void getCarDetails(){
        System.out.println("getting car details");
    }
    @Test
    public void getCarDeliveryDetails(){
        System.out.println("getting delivery details");
    }
    @BeforeSuite
    public void bsuite(){
        System.out.println("Before Suite");
    }
}
