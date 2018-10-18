package com.qa.Library;

public class DVD extends LibraryItem {
	private String genre;
	private String dateOfCreation;

	public DVD(String name, String genre, String dateOfCreation) {
		super(name);
		this.genre = genre;
		this.dateOfCreation = dateOfCreation;
		Library.mainList.add(this);
	}

	@Override
	public String toString() {
		return "DVD [Name: " + name + ", Genre :" + genre + "]";
	}

}
