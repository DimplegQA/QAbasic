package obj.repository.demo;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceltest1 {
	public static void main(String[] args) {
		getrowCount();
	}
	public static void getrowCount() {
XSSFWorkbook workbook;
try {
	//String projpath=System.getProperty("user.dir");//to find the location of the file
	workbook = new XSSFWorkbook("C:\\Users\\DELL\\Pictures\\Object repository\\excel\\dimple12.xlsx");// to file in the given path
	XSSFSheet sheet= workbook.getSheet("dec");//to get desire sheet in workbook	
	System.out.println(sheet.getPhysicalNumberOfRows());
	
	String a =sheet.getRow(4).getCell(3).getStringCellValue();
	
	String cell = sheet.getRow(0).getCell(0).getStringCellValue();
	String cell2 = sheet.getRow(0).getCell(1).getStringCellValue();// to access the cell
	String cell3 = sheet.getRow(1).getCell(1).getStringCellValue();
	
	sheet.createTable();
	System.out.println("no of row of data in the dec sheet :"+sheet.getPhysicalNumberOfRows());
	System.out.println(cell+"\n"+cell2+"\n"+cell3);
	System.out.println(a);
} catch (Exception exp) {
	// TODO Auto-generated catch block
	System.out.println(exp.getMessage());
	exp.getCause();
	
}

	}

}
