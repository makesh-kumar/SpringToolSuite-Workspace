package com.orchestrator.service;

import java.util.ArrayList;
import java.util.List;

import com.orchestrator.model.OracleData;
import com.smartsheet.api.Smartsheet;
import com.smartsheet.api.SmartsheetException;
import com.smartsheet.api.SmartsheetFactory;
import com.smartsheet.api.models.Cell;
import com.smartsheet.api.models.Row;
import com.smartsheet.api.models.Sheet;

public class ReadOracleSheet {
	
	// Initialize client
	String accessToken = "ysl1gk6lk2bkal5cay72z31903";
	// Load all smartsheet
	Smartsheet smartsheet = SmartsheetFactory.createDefaultClient(accessToken);
	// Our sheet id
	long sheetId =4963508434560900L;
	
	public List<OracleData> readOracle() throws SmartsheetException{
	
		List<OracleData> list = new ArrayList<OracleData>();
		
		Sheet sheet = smartsheet.sheetResources().getSheet(sheetId, null, null, null, null, null, null, null);
		List<Row> L = sheet.getRows();
		
		for(Row row: L) {
			List<Cell> cells = new ArrayList<Cell>();
			cells = row.getCells();
			
		
				OracleData data = new OracleData();
				System.out.println(cells.get(4).getValue().toString());

				
//				data.setNo(cells.get(0).getValue()!=null?FormatString.format(cells.get(0).getValue().toString()).toString() :""  );
				
//				data.setNo(cells.get(0).getValue()!=null?cells.get(0).getValue().toString() :""  );
				data.setName(cells.get(1).getValue()!=null?FormatString.format(cells.get(1).getValue().toString()).toString() :"");
				data.setProjNum(cells.get(2).getValue()!=null?FormatString.format(cells.get(2).getValue().toString()).toString() :"" );
				data.setEmpNum(cells.get(3).getValue()!=null?FormatString.format(cells.get(3).getValue().toString()).toString() :"");
				data.setFrmTaskNum(cells.get(4).getValue()!=null?FormatString.format(cells.get(4).getValue().toString()).toString() :"");
				data.setHoursVal(cells.get(5).getValue()!=null?FormatString.format(cells.get(5).getValue().toString()).toString() :"");
				data.setTransferType(cells.get(6).getValue()!=null?FormatString.format(cells.get(6).getValue().toString()).toString() :"");
				data.setToTaskNum(cells.get(7).getValue()!=null?FormatString.format(cells.get(7).getValue().toString()).toString() :"");
				data.setToProjNum(cells.get(8).getValue()!=null?FormatString.format(cells.get(8).getValue().toString()).toString() :"");
				data.setFrmExpDate(cells.get(9).getValue()!=null?FormatString.format(cells.get(9).getValue().toString()).toString() :"");
				data.setToExpDate(cells.get(10).getValue()!=null?FormatString.format(cells.get(10).getValue().toString()).toString() :"");
				data.setTicNo(cells.get(11).getValue()!=null?FormatString.format(cells.get(11).getValue().toString()).toString() :"");
				data.setType(cells.get(12).getValue()!=null?FormatString.format(cells.get(12).getValue().toString()).toString() :"");
				data.setSpoc(cells.get(13).getValue()!=null?FormatString.format(cells.get(13).getValue().toString()).toString() :"");
				data.setStatus(cells.get(14).getValue()!=null?FormatString.format(cells.get(14).getValue().toString()).toString() :"");
				
				list.add(data);
	
			
		}
		
		return list;
	}

}
