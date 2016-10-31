package edu.elon.composite;

import java.util.ArrayList;

public class Car {
	
	ArrayList<CarComponent> carComponents = new ArrayList<>();
	String name;
	String description;
	double price;
	
	public Car(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
		
	}
	
	public void add(CarComponent carComponent) {
		carComponents.add(carComponent);
	}
	
	public void remove(CarComponent carComponent) {
		carComponents.remove(carComponent);
	}
	
	
	public CarComponent getChild(int i) {
		return carComponents.get(i);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void print() {
		System.out.println("Summary");
		System.out.println("Model");
		
		System.out.println("\n" + getName());
	}

}
