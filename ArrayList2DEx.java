import java.util.ArrayList;

public class ArrayList2DEx {
   public static void main(String[] args) {
	  ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

	  ArrayList<String> bakeryList = new ArrayList<String>(); 
	  bakeryList.add("pasta");
	  bakeryList.add("garlic bread");
	  bakeryList.add("donuts");

	  ArrayList<String> produceList = new ArrayList<String>();
	  produceList.add("tomatoes");
	  produceList.add("zucchini");
	  produceList.add("peppers");

	  ArrayList<String> drinksList = new ArrayList<String>();
	  drinksList.add("soda");
	  drinksList.add("coffee");

	  groceryList.add(bakeryList);
	  groceryList.add(produceList);
	  groceryList.add(drinksList);

	  String pasta = groceryList.get(0).get(0); 
	  String coffee = groceryList.get(2).get(1);

	  System.out.println(pasta);
	  System.out.println(coffee);
   }
}
