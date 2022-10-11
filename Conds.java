public class Conds {
   public static void main(String[] args) {
	  String ageStr = args[0];
	  int age = Integer.parseInt(ageStr);
	  
	  if(age >= 75) {
		System.out.println("OK, Boomer.");
	  } else if(age >= 18) {
		System.out.println("You are an adult.");
	  } else if(age >= 13) {
		System.out.println("You are a teenager.");
	  } else {
		System.out.println("You are not an adult.");
	  }

	  String dayStr = args[1];
	  switch(dayStr) {
		 case "Sunday":
			System.out.println("Today is Sunday.");
			break;
		 case "Monday":
			System.out.println("Today is Monday.");
			break;
		 case "Tuesday":
			System.out.println("Today is Tuesday.");
			break;
		 case "Wednesday":
			System.out.println("Today is Wednesday.");
			break;
		 case "Thursday":
			System.out.println("Today is Thursday.");
			break;
		 case "Friday":
			System.out.println("Today is Friday.");
			break;
		 case "Saturday":
			System.out.println("Today is Saturday.");
			break;
	     default:
			System.out.println(dayStr + " is not a day.");
	  }
   }
}
