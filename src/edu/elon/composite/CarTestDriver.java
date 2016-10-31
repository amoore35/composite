package edu.elon.composite;

public class CarTestDriver {

	public static void main(String[] args) {
		CarComponent summary = new CarCategory("Summary");
		CarComponent model = new CarCategory("Model");
		CarComponent colors = new CarCategory("Colors");
		CarComponent accessories = new CarCategory("Accessories");
		CarComponent exterior = new CarCategory("Exterior");
		CarComponent interior = new CarCategory("Interior");
				
		summary.add(model);
		summary.add(colors);
		summary.add(accessories);
		accessories.add(exterior);
		accessories.add(interior);
		
		CarComponent carModel = new CarItem("2016 CR-Z EX", "Manual", 22140.00);
		model.add(carModel);
		
		CarComponent exteriorColor = new CarItem("Exterior: Milano Red", "", 0.0);
		CarComponent interiorColor = new CarItem("Interior: Black/Orange", "", 0.0);
		colors.add(exteriorColor);
		colors.add(interiorColor);
		
		CarComponent spoiler = new CarItem("Tailgate Spoiler", "", 430.00);
		exterior.add(spoiler);
		
		CarComponent floorMats = new CarItem("All Season Floor Mats", "", 99.00);
		CarComponent handling = new CarItem("Destination and handling", "", 835.00);
		interior.add(floorMats);
		interior.add(handling);
		
		
		Driver driver = new Driver(summary);
		driver.print();
		
		

	}

}
