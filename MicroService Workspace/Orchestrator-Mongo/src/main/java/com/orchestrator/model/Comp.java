package com.orchestrator.model;

import javax.management.loading.PrivateClassLoader;

public class Comp 
{
	private String ticNo;
	
	private String compName;
	private String status;
	
	
	
	public Comp() {
		super();
		// TODO Auto-generated constructor stub
	}






	public String getTicNo() {
		return ticNo;
	}






	public void setTicNo(String ticNo) {
		this.ticNo = ticNo;
	}






	public Comp(String ticNo, String compName, String status) {
		super();
		this.ticNo = ticNo;
		this.compName = compName;
		this.status = status;
	}






	public String getCompName() {
		return compName;
	}



	public void setCompName(String compName) {
		this.compName = compName;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}






	@Override
	public String toString() {
		return "Comp [ticNo=" + ticNo + ", compName=" + compName + ", status=" + status + "]";
	}



	
	
	
	

}
