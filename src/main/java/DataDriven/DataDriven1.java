package DataDriven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven1 {
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public DataDriven1(String excelPath, String sheetName){
        try {
            workbook = new XSSFWorkbook(excelPath);
            sheet = workbook.getSheet(sheetName);
        }catch (Exception exp){
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }

    public int getRowCount(){
            int rowCount = 0;
            rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println("No.of rows " +rowCount);
            return rowCount;
    }

    public int getColumnCount(){
        int columnCount = 0;
        columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("No. of column " +columnCount);
        return columnCount;
    }

    public String getCellStringData(int rowNum, int cellNum){
            String cellData = null;
            cellData = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
            System.out.println(cellData);
            return cellData;
    }
    public void getCellIntData(int rowNum, int cellNum){
        double cellData = sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
        System.out.println(cellData);
    }
}
