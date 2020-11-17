package com.example.demo.model;

public class Catalog 
{
	private String bookName;
	private String bookAuth;
	private String rating;
	
	
	
	public Catalog() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Catalog(String bookName, String bookAuth, String rating) {
		super();
		this.bookName = bookName;
		this.bookAuth = bookAuth;
		this.rating = rating;
	}


	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuth() {
		return bookAuth;
	}
	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	
	

}
