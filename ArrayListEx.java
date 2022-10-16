import java.util.ArrayList;

public class ArrayListEx {
   public static void main(String[] args) {
	   ArrayList<String> food = new ArrayList<String>();

	   food.add("pizza");
	   food.add("hamburger");
	   food.add("hotdog");

	   for(int i = 0; i < food.size(); i++) {
		   System.out.println(food.get(i));
	   }

	   food.set(0, "sushi");

	   for(int i = 0; i < food.size(); i++) {
		   System.out.println(food.get(i));
	   }

	   food.remove(2);

	   for(int i = 0; i < food.size(); i++) {
		   System.out.println(food.get(i));
	   }

	   food.clear();

	   String foodMsg = "";
	   if(food.size() > 0)
		  foodMsg = "some";
	   else
		  foodMsg = "no"; 
	   System.out.print("There's " + foodMsg + " food left.");
   }
}
