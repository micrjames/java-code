public class Car extends Vehicle {
   	String make;
	String model;
	int year;
	String color;
	double price;

	int numWheels = 4;
	int numDoors = 4;

	Car(String make, String model, int year, String color, double price) {
	   this.make = make;
	   this.model = model;
	   this.year = year;
	   this.color = color;
	   this.price = price;
	}

	void drive() {
	   	System.out.println(String.format("The %s drives!", this.model));
	}

	void brake() {
	   	System.out.println(String.format("The %s brakes!", this.model));
	}

	public String toString() {
	    return String.format("The %s %s is a %s car built in %s which costs %s.", this.make, this.model, this.color, this.year, this.price);
	}
}
