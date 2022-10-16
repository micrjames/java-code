public class StringMeths {
   public static void main(String[] args) {
	   // String = a reference data type that can store
	   // one or more characters

	   String name = "Michael";

	   // boolean result = name.equalsIgnoreCase("michael");
	   // int result = name.length();
	   // char result = name.charAt(0);
	   // int result = name.indexOf("M");
	   // boolean result = name.isEmpty();
	   // String result = name.toUpperCase();
	   // String result = name.toLowerCase();
	   // name = "   " + name + "    ";
	   // String result = name.trim();
	   String result = name.replace('M', 'P');

	   System.out.println(result);
   }
}
