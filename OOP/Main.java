public class Main {
   public static void main(String[] args) {
	   Car taurus = new Car("Ford", "Taurus", 1992, "green", 12000.00);
	   Car mustang = new Car("Ford", "Mustang", 2019, "yellow", 32000.00);
	   Car camaro = new Car("Chevrolet", "Camaro", 2015, "red", 45000.00);
	   Car beetle = new Car("Volkswagen", "Beetle", 1968, "green", 7000.00);
	   Car bronco = new Car("Chevrolet", "Bronco", 1988, "white", 12000.00);
	   Car sable = new Car("Mercury", "Sable", 1994, "dark green", 900.00);

	   System.out.println(taurus);
	   System.out.println(mustang);
	   System.out.println(camaro);
	   System.out.println(beetle);
	   System.out.println(bronco);
	   System.out.println(sable);

	   int numberOfPkgStalls = 5;
	   Garage garage = new Garage(numberOfPkgStalls);
	   garage.park(taurus);
	   garage.park(mustang);
	   garage.park(camaro);
	   garage.park(beetle);
	   garage.park(bronco);
	   garage.park(sable);

	   System.out.println(String.format("I have %d friends.", Friend.numberOfFriends));
	   Friend friend1 = new Friend("Tony");
	   System.out.println(String.format("I have %d friends.", Friend.numberOfFriends));
	   Friend friend2 = new Friend("Paulie");
	   System.out.println(String.format("I have %d friends.", Friend.numberOfFriends));
	   Friend friend3 = new Friend("Bobby");
	   System.out.println(String.format("I have %d friends.", Friend.numberOfFriends));
   }
}
