package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicTestNG {
    @Parameters({"userName"})
    @Test
    public void Demo(String username){
        System.out.println("Hello world");
        System.out.println(username);
    }
    @Test
    public void secondTest(){
        System.out.println("second test");
    }
    @AfterTest
    public void lastExecution(){
        System.out.println("last execution");
    }
}
