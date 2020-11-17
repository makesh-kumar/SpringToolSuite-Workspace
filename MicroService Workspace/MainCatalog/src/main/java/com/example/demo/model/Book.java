package com.example.demo.model;

public class Book {
	
	private String bookid;
	private String bookname;
	private String bookauthor;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	




	public Book(String bookid, String bookname, String bookauthor) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
	}







	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}



	public String getBookauthor() {
		return bookauthor;
	}



	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}



	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + "]";
	}
	
	
	
	
	
	

}
