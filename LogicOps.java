import java.util.Scanner;

public class LogicOps {
   public static void main(String[] args) {
	   String tempStr = args[0];
	   int temp = Integer.parseInt(tempStr);

	   if(temp > 100) {
		  System.out.println("It's hot outside!");
	   } else if(temp >= 80 && temp <= 100) {
		  System.out.println("It's warm outside.");
	   } else if(temp >= 60 && temp < 80) {
		  System.out.println("It's cool outside.");
	   } else {
		  System.out.println("It's cold outside.");
	   }

	   Scanner scanner = new Scanner(System.in);

	   System.out.println("You are playing a game! Press q or Q to quit.");
	   String response = scanner.next();

	   // if(response.equals("q") || response.equals("Q")) {
	   // !(if(response.equals("q") || response.equals("Q")))
	   if(!response.equals("q") && !response.equals("Q")) {
		  System.out.println("You just quit the game.");
	   } else { 
		  System.out.println("You are still playing the game.");
	   }
   }
}
