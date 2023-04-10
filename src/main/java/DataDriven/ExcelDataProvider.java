package DataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
//    @Test(dataProvider = "Test1")
//    public void execute(String Testcases, String Data1, String Data2, String Data3){
//        System.out.println(Testcases+" | "+Data1+" | "+Data2+" | "+Data3);
//        System.out.println(Testcases+" | "+Data1);
//    }
    @DataProvider(name="Test1")
    public Object[][] getData(){
        String path = "C://Users//premkumar.sarathi//Downloads//Book2.xlsx";
        Object[][] data=testData(path, "testData");
        return data;
    }
    public static Object[][] testData(String excelPath, String sheetName){
        DataDriven1 dataDriven1 = new DataDriven1(excelPath, sheetName);
        int rowCount = dataDriven1.getRowCount();
        int columnCount = dataDriven1.getColumnCount();
        Object[][] data = new Object[rowCount - 1][columnCount];
        for (int i=1; i< rowCount;i++){
            for (int j=0;j<columnCount;j++){
                String cellData = dataDriven1.getCellStringData(i,j);
                System.out.print(cellData+ "|");
                data[i-1][j]=cellData;
            }
            System.out.println("");
        }
        return data;
    }
}
