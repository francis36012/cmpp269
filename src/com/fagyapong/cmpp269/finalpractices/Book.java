package com.fagyapong.cmpp269.finalpractices;

public class Book {
	
	String name;
	int pages;
	int bookmark;
	
	public Book(String bkName, int bkPages) {
		name = bkName;
		pages = bkPages;
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