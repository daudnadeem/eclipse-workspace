package com.qa.Garage;

public class Motorcycle extends Vehicle {

	private String brandName;
	private String model;
	private String typeOfMotorCycle;
	
	public Motorcycle (String brandName, String model, String typeOfMotorCycle, int engineSize, int year, String licensePlate) {
		this.brandName = brandName;
		this.model = model;
		this.typeOfMotorCycle = typeOfMotorCycle;
		setYearOfMake(year);
		setLicensePlateNumber(licensePlate);
		setEngineSize(engineSize);
		
	}

	@Override
	public String toString() {
		return "Motorcycle [Brand Name = " + brandName + ", model = " + model 
				+ ", Type of Motorcycle = " + typeOfMotorCycle + ", Year = " + getYearOfMake() + ", License Plate = " + getLicensePlateNumber()
				+ "]";
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

	public String getTypeOfMotorCycle() {
		return typeOfMotorCycle;
	}

	public void setTypeOfMotorCycle(String typeOfMotorCycle) {
		this.typeOfMotorCycle = typeOfMotorCycle;
	}

}
