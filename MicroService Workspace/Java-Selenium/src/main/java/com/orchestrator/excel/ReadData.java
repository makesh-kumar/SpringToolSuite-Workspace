package com.orchestrator.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Value;



public class ReadData 
{
//	@Value("${spring.pid.file}")
	public String path= "C:\\Users\\91909\\Desktop\\ValData1.xlsx";
	

	public List<String> fetchOneData() {
		
		List<String> list = new  ArrayList<String>();
		try {

			
			File file = new File(path); // creating a new file instance

			FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object

			Iterator<Row> itr = sheet.iterator(); // iterating over excel file
			
		
			while (itr.hasNext()) 
			{
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
				
				while (cellIterator.hasNext()) 
				{
					Cell cell = cellIterator.next();

					if (cell.getRowIndex() > 0) {
						
						if (cell.getColumnIndex() == 0)
							{
							list.add(cell.getStringCellValue().toString());
							System.out.println(cell.getStringCellValue().toString());

							}

					}					
				}
	

					

			}

			fis.close();

		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return list;
			}
	


	
}
