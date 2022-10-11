import java.util.Random;

public class Rand {
   public static void main(String[] args) {
	  Random random = new Random();

	  int endPtExcl = 6;
	  int dieRoll = random.nextInt(endPtExcl) + 1;
	  // also nextDouble()
	  // also nextBoolean()

	  System.out.println("die roll: " + dieRoll);
   }
}
