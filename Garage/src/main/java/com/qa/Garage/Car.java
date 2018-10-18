package com.qa.Garage;

public class Car extends Vehicle {

	private String brandName;
	private String model;
	private String colour;
	

	public Car(String brandName, String model, String colour, int engineSize,  int yearOfMake, String licensePlate) {

		this.brandName = brandName;
		this.model = model;
		this.colour = colour;
		setEngineSize(engineSize);
		setYearOfMake(yearOfMake);
		setLicensePlateNumber(licensePlate);
		

	}

	@Override
	public String toString() {
		return "Car [Brand Name = " + brandName + ", Model = " + model + ", Colour = " + colour + ", Engine = " + getEngineSize()
				+ ", Year = " + getYearOfMake() + ", License Plate = " + getLicensePlateNumber() + "]";
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
