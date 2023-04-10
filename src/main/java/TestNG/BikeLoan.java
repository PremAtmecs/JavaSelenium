package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BikeLoan {
    @Test(groups = {"smoke"})
    public void bikeDetails(){
        System.out.println("getting bike details");
    }
    @Test
    public void bikeDeliveryDetails(){
        System.out.println("getting bike delivery details");
    }
    @BeforeTest
    public void prerequiste(){
        System.out.println("I running this method first");
    }

}
