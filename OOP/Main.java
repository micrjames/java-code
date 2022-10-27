public class Main {
   public static void main(String[] args) {
	   Car myCar = new Car("Chevrolet", "Corvette", 2020, "blue", 50000.00);
	   Car otherCar = new Car("Ford", "Taurus", 1999, "green", 17000.00);

	   System.out.println(myCar.make);
	   System.out.println(myCar.model);

	   myCar.drive();
	   myCar.brake();

	   System.out.println(otherCar.make);
	   System.out.println(otherCar.model);

	   otherCar.drive();
	   otherCar.brake();

	   DiceRoller dr = new DiceRoller();
	   System.out.println(String.format("You rolled a %d.", dr.roll()));
   }
}
