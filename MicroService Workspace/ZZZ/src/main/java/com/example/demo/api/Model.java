package com.example.demo.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Model 
{
	private String incidentNum;
	private String supportSpoc;
	private String autoClosed;
	private String ticketType;
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model(String incidentNum, String supportSpoc, String autoClosed, String ticketType) {
		super();
		this.incidentNum = incidentNum;
		this.supportSpoc = supportSpoc;
		this.autoClosed = autoClosed;
		this.ticketType = ticketType;
	}
	public String getIncidentNum() {
		return incidentNum;
	}
	public void setIncidentNum(String incidentNum) {
		this.incidentNum = incidentNum;
	}
	public String getSupportSpoc() {
		return supportSpoc;
	}
	public void setSupportSpoc(String supportSpoc) {
		this.supportSpoc = supportSpoc;
	}
	public String getAutoClosed() {
		return autoClosed;
	}
	public void setAutoClosed(String autoClosed) {
		this.autoClosed = autoClosed;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	@Override
	public String toString() {
		return "Model [incidentNum=" + incidentNum + ", supportSpoc=" + supportSpoc + ", autoClosed=" + autoClosed
				+ ", ticketType=" + ticketType + "]";
	}

}
