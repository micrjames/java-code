public class MathFuncs {
   public static void main(String[] args) {
	  double x = 3.14;
	  double y = -10;

	  double max = Math.max(x, y);
	  double min = Math.min(x, y);
	  System.out.println("min: " + min + ", max: " + max);

	  double abs = Math.abs(y);
	  System.out.println("abs(" + y + ") = " + abs);

	  double sqrt = Math.sqrt(abs);
	  System.out.println("square root of " + abs + " is " + sqrt);

	  double round = Math.round(x);          
	  System.out.println("x rounded is " + round);
													
	  double roundedUp = Math.ceil(x);
	  System.out.println("x rounded up is " + roundedUp);

	  double roundedDown = Math.floor(x);      
	  System.out.println("x rounded down is " + roundedDown);
   }
}
