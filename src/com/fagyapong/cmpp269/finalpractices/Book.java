package com.fagyapong.cmpp269.finalpractices;

public class Book {
	
	String name;
	int pages;
	int bookmark;
	
	public Book(String name, int pages) {
		this.name = name;
		this.pages = pages;
	}
	
	public void setBookmark(int pageNumber) {
		bookmark = pageNumber;
	}
	
	public int getBookmark() {
		return bookmark;
	}
	
	public double getPercentageComplete() {
		return ((double)bookmark / pages) * 100;
	}
}