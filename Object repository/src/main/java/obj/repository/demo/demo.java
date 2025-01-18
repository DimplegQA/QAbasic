package obj.repository.demo;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class demo {
	public static void main(String[]args)   
	{  
	try   
	{  
	//declare file name to be create   
	String filename = "C:\\Users\\DELL\\Pictures\\Object repository\\demo\\demoexcel.xlsx";  
	//creating an instance of HSSFWorkbook class  
	
	HSSFWorkbook workbook = new HSSFWorkbook();  
	//invoking creatSheet() method and passing the name of the sheet to be created   
	HSSFSheet sheet = workbook.createSheet("jan");
	HSSFSheet sheet1 = workbook.createSheet("Feb");
	HSSFSheet sheet3= workbook.createSheet("Apr");
	//creating the 0th row using the createRow() method  
	HSSFRow i = sheet3.createRow((short)2);
	i.createCell(2).setCellValue("QATesting");
	HSSFRow a = sheet.createRow((short)0);  
	//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
	a.createCell(0).setCellValue("S.No.");  
	a.createCell(1).setCellValue("student Name");  
	a.createCell(2).setCellValue("role Number");  
	a.createCell(3).setCellValue("school");  
	a.createCell(4).setCellValue("date of birth");
	a.createCell(5).setCellValue("date");
	HSSFRow a1 = sheet1.createRow((short)0);  
	//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
	a1.createCell(0).setCellValue("S.No.");  
	a1.createCell(1).setCellValue("student Name");  
	a1.createCell(2).setCellValue("role Number");  
	a1.createCell(3).setCellValue("school");  
	a1.createCell(4).setCellValue("date of birth");  
	//creating the 1st row  
	HSSFRow row = sheet.createRow((short)1);  
	//inserting data in the first row  
	row.createCell(0).setCellValue("1001");  
	row.createCell(1).setCellValue("John ");  
	row.createCell(2).setCellValue("4449499");  
	row.createCell(3).setCellValue("geethanjali");  
	row.createCell(4).setCellValue("12/14/2000");  
	//creating the 2nd row  
	HSSFRow row1 = sheet.createRow((short)2);  
	//inserting data in the second row  
	row1.createCell(0).setCellValue("1002");  
	row1.createCell(1).setCellValue("ravi");  
	row1.createCell(2).setCellValue("44442222");  
	row1.createCell(3).setCellValue("littleharts");  
	row1.createCell(4).setCellValue("1/14/2001");  
	HSSFRow row2 = sheet.createRow((short)3);  
	//inserting data in the second row  
	row2.createCell(0).setCellValue("1002");  
	row2.createCell(1).setCellValue("ravi");  
	row2.createCell(2).setCellValue("44442222");  
	row2.createCell(3).setCellValue("littleharts");  
	row2.createCell(4).setCellValue("1/14/2001");
	HSSFRow row3 = sheet.createRow((short)4);  
	//inserting data in the second row  
	row3.createCell(0).setCellValue("1002");  
	row3.createCell(1).setCellValue("ravi");  
	row3.createCell(2).setCellValue("44442222");  
	row3.createCell(3).setCellValue("littleharts");  
	row3.createCell(4).setCellValue("1/14/2001");
	FileOutputStream fileOut = new FileOutputStream(filename);  
	workbook.write(fileOut);  
	//closing the Stream  
	fileOut.close();  
	//closing the workbook  
	workbook.close();  
	//prints the message on the console  
	System.out.println("Excel file has been generated successfully.");  
	}   
	catch (Exception e)   
	{  
	e.printStackTrace();  
	}  
}}
