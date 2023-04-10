package DataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {

    @Test(dataProvider = "driverTest")
    public void testcaseData(String greeting, String communication, int id){
        System.out.println(greeting+" "+communication+" "+id);
        int length = getData().length;
        System.out.println(length);
    }

    @DataProvider(name="driverTest")
    public Object[][] getData(){
        Object[][] data = {{"hello", "text", 123}, {"Bye", "Message", 456}, {"Solo", "call", 789}};
        return data;
    }
}
