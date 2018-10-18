package com.qa.Library;

public class Journal extends LibraryItem {

	private String author;
	private String dateOfCreation;

	public Journal(String author, String dateOfCreation, String name) {
		super(name);
		this.author = author;
		this.dateOfCreation = dateOfCreation;
		Library.mainList.add(this);
	}

	@Override
	public String toString() {
		return "Journal [Name: " + name + "Author: " + author + "]";
	}

	public String getJournalAuthor() {
		return author;
	}

	public void setJournalAuthor(String author) {
		this.author = author;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

}
