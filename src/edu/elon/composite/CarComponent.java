package edu.elon.composite;

public abstract class CarComponent {

	public void add(CarComponent carComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(CarComponent carComponent) {
		throw new UnsupportedOperationException();
	}
	
	public CarComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}
	
}