package com.qa.Garage;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Runner {
	
	public static void main(String[] args) {
		
		Garage g = new Garage();
		
		Car car1 = new Car("Toyota", "Supra", "Orange", 4, 2017, "ABC123");
		Car car2 = new Car("Toyota", "GLI", "Silver", 2, 2012, "CBA321");
		
		Motorcycle mc1 = new Motorcycle("Harley Davidson", "modelOne", "Heavy Bike", 3, 2015, "DVD50N");
		
		g.addCar("Nissan", "Skyline", "Purple", 5, 2002, "NI55AN");
		g.addMotorcycle("Kawasaki", "ultraRed", "Sports Bike", 4, 3000, "K4W4ZI");
		
		g.addVehicle(car1);
		g.addVehicle(car2);
		g.addVehicle(mc1);
		
//		
//		System.out.println(g.calcDollah());
		
		
		
		
		

		
//		g.vehicles.stream().forEach(System.out::println);
		
	}
}
