import java.io.FileWriter;
import java.io.IOException;

public class FileWriter {
   public static void main(String[] args) {
	  try {
		 FileWriter writer = new FileWriter("poem.txt");
		 writer.write("Roses are red.\nViolets are blue.\n");
		 // writer.append("...");
		 writer.close();
	  } catch(IOException e) {
		 e.printStackTrace();
	  }
   }
}
