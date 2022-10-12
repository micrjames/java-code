import java.util.Scanner;

public class NestedLoops {
   public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int rows, columns;
	  String symbol = "";

	  System.out.print("Enter # of rows > ");
	  rows = scanner.nextInt();

	  System.out.print("Enter # of columns > ");
	  columns = scanner.nextInt();

	  System.out.print("Enter symbol to use > ");
	  symbol = scanner.next();
	  
	  for(int i = 1; i <= rows; i++) {
		 for(int j = 1; j <= columns; j++) {
			System.out.print(symbol);
		 }
		 System.out.println();
	  }
   }
}
