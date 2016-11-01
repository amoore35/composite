package edu.elon.composite;

public class Driver {
	
	private CarComponent allComponents;
	
	public Driver(CarComponent allComponents) {
		this.allComponents = allComponents;
	}
	
	public void print() {
		allComponents.print();
		System.out.printf("%45s$%,.2f%n","Total MSRP as built ", allComponents.getPrice());
	}

}
