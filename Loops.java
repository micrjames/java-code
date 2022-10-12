import java.util.Scanner;

public class Loops {
   public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);

	  String name = "";
	  /*
	  while(name.isBlank()) {
		 System.out.print("Enter your name > ");
		 name = scanner.nextLine();
	  }
	  */

	  do {
		 System.out.print("Enter your name > ");
		 name = scanner.nextLine();
	  } while(name.isBlank());

	  for(int i = 0; i < 5; i++) {
		 System.out.println("Hello, " + name + ".");
	  }
   }
}
