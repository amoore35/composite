package edu.elon.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class CarCategory extends CarComponent{
	
	ArrayList<CarComponent> carComponents = new ArrayList<>();
	private String name;
    private double price;
	
	public CarCategory(String name) {
		this.name = name;
		price = 0.0;
		
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

	public double getPrice() {
		Iterator<CarComponent> iterator = carComponents.iterator();
		while (iterator.hasNext()) {
			CarComponent carComponent = iterator.next();
			
			price += carComponent.getPrice();
		}
		
		return price;
	}
	
	public void print() {
		System.out.println(name);
		
		Iterator<CarComponent> iterator = carComponents.iterator();
		while (iterator.hasNext()) {
			CarComponent carComponent = iterator.next();
			
			carComponent.print();
		}
		
	}

}
