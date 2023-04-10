package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
    @Test(dataProvider = "getData")
    public void result(String username, String password){
        System.out.println(username+ " ," +password);

    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data=  new Object[3][2];
        data[0][0] = "first Username";
        data[0][1] = "first password";
        data[1][0] = "second username";
        data[1][1] = "second Password";
        data[2][0] = "third username";
        data[2][1] = "third password";
        return data;
    }
}
