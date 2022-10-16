public class Methods {
   public static void main(String[] args) {
	   String name = "Michael";
	   String greeting = hello(name);
	   System.out.println(greeting);

	   int sum = add(3, 4);
	   System.out.println("The sum of the numbers is " + sum + ".");
   }

   static String hello(String name) {
	   return "Hello, " + name + "!";
   }

   static int add(int x, int y) {
	   return x + y;
   }
}
