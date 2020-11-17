package com.orchestrator.service;

import java.util.ArrayList;
import java.util.List;

import com.smartsheet.api.Smartsheet;
import com.smartsheet.api.SmartsheetException;
import com.smartsheet.api.SmartsheetFactory;
import com.smartsheet.api.models.Cell;
import com.smartsheet.api.models.Row;
import com.smartsheet.api.models.Sheet;

public class CreateRow {
	
	public void createRow() throws SmartsheetException {
		
		/*STEPS TO ADD NEW ROW
		 * 
		 * 1-Declare RowList->Declare Row -> Declare CellList -> Declare Cell
		 * 2-Put values to cell using coloumn id
		 * 3-add cell to CellList
		 * 4-add cellList to row
		 * 5-add row to RowList
		 * 6-update rowList in smartSheet
		 *  */

		String accessToken = "ysl1gk6lk2bkal5cay72z31903";
		Smartsheet smartsheet = SmartsheetFactory.createDefaultClient(accessToken);
		long sheetId =7854972760024964L;

		// Load the entire sheet
		Sheet sheet = smartsheet.sheetResources().getSheet(sheetId, null, null, null, null, null, null, null);
		
		List<Row> L = sheet.getRows();

	
		
		
		//Step 1:
		List<Row> rows = new ArrayList<Row>();
		Row r = new Row();
		List<Cell> cells = new ArrayList<Cell>();
		Cell c = new Cell();
		
		//Step 2:
		for (int i = 1; i < 5; i++)
		{
			c.setColumnId(L.get(0).getCells().get(i).getColumnId());
			c.setValue("AAA");
			
			//Step 3:
			cells.add(c);
		}
		
		//Step 4:
		r.setCells(cells);
		
		//Step 5:
		rows.add(r);

		//Step 6:
		smartsheet.sheetResources().rowResources().addRows(sheetId, rows);

		//To delete row using row id
//			smartsheet.sheetResources().rowResources().deleteRow(sheetId, L.get(7).getId());

	}

}
