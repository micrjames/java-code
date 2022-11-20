import java.io.File;

public class Main {
   public static void main(String[] args) {
	   File file = new File("secret_message");
	   // file.getPath()
	   // file.getAbsolutePath()
	   // file.isFile()
	   // file.delete()
	   if(file.exists()) {
		  	System.out.println("That file exists!");
	   } else {
	  		System.out.println("That file doesn't exist");
	   }		
   }
}
