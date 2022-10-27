public class Car {
   	String make;
	String model;
	int year;
	String color;
	double price;

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
}
