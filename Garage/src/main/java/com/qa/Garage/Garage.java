package com.qa.Garage;


import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Garage {
	ArrayList<Vehicle> vehicles;

	public Garage() {
		vehicles = new ArrayList<Vehicle>();
	}

	public Garage(ArrayList<Vehicle> vehicles) {
		super();
		this.vehicles = vehicles;
	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public ArrayList<Vehicle> listVehicles() {
		return vehicles;
	}
	
	public  void  addCar(String brandName, String model, String colour, int engineSize, int yearOfMake, String licensePlate) {
		Car newCar = new Car(brandName, model, colour, engineSize, yearOfMake, licensePlate);
		vehicles.add(newCar);
	}

	public void addMotorcycle(String brandName, String model, String typeOfMotorCycle, int engineSize, int year, String licensePlate) {
		Motorcycle newMC = new Motorcycle(brandName, model, typeOfMotorCycle, engineSize, year, licensePlate);
		vehicles.add(newMC);

	}
	
	public void calcDollah() {
//		System.out.println(vehicles.stream().filter(x -> x.getEngineSize() == (1)).filter(x -> x.getYearOfMake() < 2010).forEach(x -> x.setPrice(2000)));
//		System.out.println(vehicles.stream().filter(x -> x.getEngineSize() == (1)).filter(x -> x.getYearOfMake() > 2010).forEach(x -> x.setPrice(3000)));
		
//		vehicles.stream().filter(x -> x.getEngineSize() == (2)).filter(x -> x.getYearOfMake() < 2010).forEach(x -> x.setPrice(3500));
//		vehicles.stream().filter(x -> x.getEngineSize() == (2)).filter(x -> x.getYearOfMake() > 2010).forEach(x -> x.setPrice(4500));
//		
//		vehicles.stream().filter(x -> x.getEngineSize() == (3)).filter(x -> x.getYearOfMake() < 2010).forEach(x -> x.setPrice(6000));
//		vehicles.stream().filter(x -> x.getEngineSize() == (3)).filter(x -> x.getYearOfMake() > 2010).forEach(x -> x.setPrice(8000));
//		
//		vehicles.stream().filter(x -> x.getEngineSize() == (4)).filter(x -> x.getYearOfMake() < 2010).forEach(x -> x.setPrice(15000));
//		vehicles.stream().filter(x -> x.getEngineSize() == (4)).filter(x -> x.getYearOfMake() > 2010).forEach(x -> x.setPrice(25000));
//		
//		vehicles.stream().filter(x -> x.getEngineSize() == (5)).filter(x -> x.getYearOfMake() < 2010).forEach(x -> x.setPrice(30000));
//		vehicles.stream().filter(x -> x.getEngineSize() == (5)).filter(x -> x.getYearOfMake() > 2010).forEach(x -> x.setPrice(80000));
		
	}

}
