public class Arrays2D {
   public static void main(String[] args) {
	   // String[][] cars = new String[3][3];
	   String[][] cars = {
		   {"Camaro", "Corvette", "Silverado"},
		   {"Mustange", "Ranger", "F-150"},
		   {"Ferrari", "Lambo", "Tesla"}
	   };

	   for(int i = 0; i < cars.length; i++) {
		   System.out.println();
		   for(int j = 0; j < cars[i].length; j++) {
			   System.out.print(cars[i][j] + " ");
		   }
	   }
   }
}
