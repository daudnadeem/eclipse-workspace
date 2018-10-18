package com.qa.Garage;

public abstract class Vehicle {

	private String licensePlateNumber;
	private int yearOfMake;
	private int engineSize;
	private int price;
	
	
	

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public int getYearOfMake() {
		return yearOfMake;
	}

	public void setYearOfMake(int yearOfMake) {
		this.yearOfMake = yearOfMake;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
