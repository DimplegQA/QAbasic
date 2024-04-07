package dataexcel1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test1 {
	public static void main(String[] args) {
		getrowCount();
	}
	public static void getrowCount() {
    XSSFWorkbook workbook;
try {
	//String projpath=System.getProperty("user.dir");//to find the location of the file
	workbook = new XSSFWorkbook(".\\excel\\data.xlsx");// to file in the given path
	XSSFSheet sheet= workbook.getSheet("DIMPLE");//to get desire sheet in workbook
	int row=sheet.getPhysicalNumberOfRows();// to access the row 
	String cell = sheet.getRow(0).getCell(0).getStringCellValue();// to access the cell
	double cell1 = sheet.getRow(1).getCell(1).getNumericCellValue();
	System.out.println(cell+" "+cell1);
	System.out.println(row);
} catch (IOException e) {
	// TODO Auto-generated catch block
	System.out.println(e.getMessage());
	e.getCause();
	e.printStackTrace();
}

	}

}

