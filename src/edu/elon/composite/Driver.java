package edu.elon.composite;

public class Driver {
	
	private CarComponent allComponents;
	
	public Driver(CarComponent allComponents) {
		this.allComponents = allComponents;
	}
	
	public void print() {
		allComponents.print();
		System.out.printf("Total MSRP as built $%.2f.%n", allComponents.getPrice());
	}

}
