package edu.elon.composite;

public class CarItem extends CarComponent {
	
	private String name;
	private String description;
	private double price;
	
	public CarItem(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	
	
	public double getPrice() {
		return price;
	}
	
	public void print() {
		System.out.println(name);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	

}
