package com.qa.Library;

public class Book extends LibraryItem {
	private String type;
	private String author;

	public Book(String author, String name, String type) {
		super(name);
		this.author = author;
		this.type = type;
		Library.mainList.add(this);

	}

	public String getBookAuthor() {
		return author;
	}

	public void setBookAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Book [Name: " + name + ", Author: " + author + "]";
	}

}
