package com.orchestrator.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Status 
{
	@Id
	private int id;
	private String ticNo;
	private String email;
	private String Spoc;
	private String hour;
	private String result;
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Status(int id, String ticNo, String email, String spoc, String hour, String result) {
		super();
		this.id = id;
		this.ticNo = ticNo;
		this.email = email;
		Spoc = spoc;
		this.hour = hour;
		this.result = result;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTicNo() {
		return ticNo;
	}
	public void setTicNo(String ticNo) {
		this.ticNo = ticNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSpoc() {
		return Spoc;
	}
	public void setSpoc(String spoc) {
		Spoc = spoc;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Status [id=" + id + ", ticNo=" + ticNo + ", email=" + email + ", Spoc=" + Spoc + ", hour=" + hour
				+ ", result=" + result + "]";
	}
	
	
}
