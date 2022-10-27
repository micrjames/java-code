public class Main {
   public static void main(String[] args) {
	   Pizza pepperoni = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
	   Pizza cheese = new Pizza("pan crust", "tomato", "mozzarella");

	   System.out.println(pepperoni.desc());
	   System.out.println(cheese.desc());
   }
}
