public class Arrays {
   public static void main(String[] args) {
	  // String[] cars = {"Camaro", "Corvette", "Tesla"};
	  String[] cars = new String[3];
	  cars[0] = "Camaro";
	  cars[1] = "Corvette";
	  cars[2] = "Tesla";

	  for(int i = 0; i < cars.length; i++) {
		 System.out.println(cars[i]);
	  }
   }
}
