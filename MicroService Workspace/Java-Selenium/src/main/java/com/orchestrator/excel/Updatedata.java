package com.orchestrator.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Updatedata 
{
//	@Value("${path}")
	public String path= "C:\\Users\\91909\\Desktop\\ValData1.xlsx";
	public void updateStatus(String sheetName, List<String> list) {

		try {
			boolean check = false;
			
			File file = new File(path); // creating a new file instance
			FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file
			XSSFWorkbook wb = new XSSFWorkbook(fis);
		
			
//			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object
			wb.createSheet(sheetName);
			XSSFSheet sheet = wb.getSheet(sheetName);
			
	
		
			CellStyle style = wb.createCellStyle();


		    XSSFFont font= wb.createFont();
		    font.setFontHeightInPoints((short)10);
		    font.setFontName("Arial");
		    font.setColor(IndexedColors.BLACK.getIndex());
		    font.setBold(true);
		    font.setItalic(false);

			style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		    style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		    style.setFont(font);
		  

		    
			Row rr = sheet.createRow(0);
			Cell cc = rr.createCell(0);
			cc.setCellValue("Result for "+sheetName);
			
			  cc.setCellStyle(style);
//		    style=cc.getCellStyle();
//		    style.setFillBackgroundColor(IndexedColors.DARK_BLUE.getIndex());
//		    style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//		    style.setAlignment(CellStyle.ALIGN_CENTER);
//		    style.setFont(font);
			
			for(int i=0; i<list.size(); i++) {
				Row r = sheet.createRow(i+1);
				Cell c = r.createCell(0);
				c.setCellValue(list.get(i).toString());
			}
			
			
//			Iterator<Row> itr = sheet.iterator(); // iterating over excel file
//			while (itr.hasNext()) {
//				Row row = itr.next();
//				Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
//				while (cellIterator.hasNext()) {
//					Cell cell = cellIterator.next();
//					if (cell.getRowIndex() > 0) {
//						if (cell.getColumnIndex() == 0) {
//							if (cell.getStringCellValue().equals(ticNo)) {
//								check = true;
//							}
//						}
//						if (cell.getColumnIndex() == 3) {
//							if (check) {
//								cell.setCellValue("Approved");
//								check = false;
//							}
//						}
//					}
//				}
//			}
//			fis.close();
//
			FileOutputStream outFile = new FileOutputStream(new File(path));
			wb.write(outFile);
			outFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
