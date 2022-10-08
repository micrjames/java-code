public class Swap {
   public static void main(String[] args) {
	  String x = "water";
	  String y = "Kool-Aid";

	  String temp;

	  System.out.println("x: " + x);
	  System.out.println("y: " + y);

	  temp = x;
	  x = y;
	  y = temp;

	  System.out.println("Now, x: " + x);
	  System.out.println("Now, y: " + y);
   }
}
