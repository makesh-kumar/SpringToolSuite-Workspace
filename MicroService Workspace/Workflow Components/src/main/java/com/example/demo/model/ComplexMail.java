package com.example.demo.model;

/**
 * @author Makesh Kumar
 *
 */
public class ComplexMail 
{
	private String to;
	private String sub;
	private String body;
	private String approveApi;
	private String rejectApi;
	public ComplexMail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComplexMail(String to, String sub, String body, String approveApi, String rejectApi) {
		super();
		this.to = to;
		this.sub = sub;
		this.body = body;
		this.approveApi = approveApi;
		this.rejectApi = rejectApi;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getApproveApi() {
		return approveApi;
	}
	public void setApproveApi(String approveApi) {
		this.approveApi = approveApi;
	}
	public String getRejectApi() {
		return rejectApi;
	}
	public void setRejectApi(String rejectApi) {
		this.rejectApi = rejectApi;
	}
	@Override
	public String toString() {
		return "ComplexMail [to=" + to + ", sub=" + sub + ", body=" + body + ", approveApi=" + approveApi
				+ ", rejectApi=" + rejectApi + "]";
	}
	
	

}
