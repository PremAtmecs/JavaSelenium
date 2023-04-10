package DataDriven;

public class ExcelUtils {
    public static void main(String[] args) {
        DataDriven1 data1 = new DataDriven1("C://Users//premkumar.sarathi//Downloads//Book2.xlsx", "SwagLabs");
        //data1.getCellIntData(2,2);
        data1.getCellStringData(1,1);
        data1.getRowCount();
        data1.getColumnCount();
    }
}
