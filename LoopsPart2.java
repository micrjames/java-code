import java.util.ArrayList;

public class LoopsPart2 {
   public static void main(String[] args) {
	   // String[] animals = {"dog", "cat", "dolphin"};
	   ArrayList<String> animals = new ArrayList<String>();
	   animals.add("dog");
	   animals.add("cat");
	   animals.add("dolphin");

	   for(String animal : animals) {
		  System.out.println(animal);
	   }
   }
}
