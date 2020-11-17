package com.example.demo;

public class employee {
	private String id;
	private String email;
	private String  status;
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(String id, String email, String status) {
		super();
		this.id = id;
		this.email = email;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", email=" + email + ", status=" + status + "]";
	}
	

}
