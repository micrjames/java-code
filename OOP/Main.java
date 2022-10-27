public class Main {
   public static void main(String[] args) {
	   Pizza pepperoni = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
	   Pizza cheese = new Pizza("pan crust", "tomato", "mozzarella");

	   System.out.println(pepperoni);
	   System.out.println(cheese);

	   Car car = new Car("Ford", "Taurus", 1992, "green", 12000.00);
	   System.out.println(car);

	   // Food[] refrigerator = new Food[3];
	   Food pizza = new Food("pizza");
	   Food burger = new Food("burger");
	   Food sandwich = new Food("sandwich");

	   // refrigerator[0] = pizza;
	   // refrigerator[1] = burger;
	   // refrigerator[2] = sandwich;

	   Food[] refrigerator = {pizza, burger, sandwich};

	   for(int i = 0; i < refrigerator.length; i++) {
		   System.out.println(refrigerator[i]);
	   }
   }
}
