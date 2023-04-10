package ECartDataDriven;

import org.testng.annotations.Test;

public class ECartTestScript {
    public EcartPageObject ecartPageObject;
    public ECartTestScript(){
        ecartPageObject = new EcartPageObject();
    }
    @Test (priority = 1)
    public void launchBrowser(){
       ecartPageObject.launchBrowser();
    }
    @Test (priority = 2, dataProvider = "Test1", dataProviderClass = Utils.class)
    public void selectProduct(String product){
       ecartPageObject.selectProduct(product);
    }
    @Test(priority = 3, dataProvider = "Studentname", dataProviderClass = Utils.class)
    public void studentName(String scenario, String username, String Password){
        System.out.println(scenario+" "+username+" "+Password);
    }
}
