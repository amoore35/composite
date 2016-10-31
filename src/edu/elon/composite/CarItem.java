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
		if (price > 0.0) {
			System.out.printf(name + "                " + description + "                $%.2f.%n", price);
		} else {
			System.out.println(name + "               " + description);
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	

}
