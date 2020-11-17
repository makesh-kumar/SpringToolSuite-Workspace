package com.example.demo.model;

public class Rating {
	
	private String bookId;
	private String rating;
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(String bookId, String rating) {
		super();
		this.bookId = bookId;
		this.rating = rating;
	}

	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Rating [bookId=" + bookId + ", rating=" + rating + "]";
	}
	
	
	
	

}
