import java.io.FileReader;

public class FileReader {
   public static void main(String[] args) {
	  try {
		 FileReader reader = new FileReader(fileName);
		 int data = reader.read();
		 while(data != -1) {
			System.out.println((char) data);
			data = reader.read();
		 }
		 reader.close();
	  } catch(FileNotFoundException e) {
		 e.printStackTrace();
	  }
   }
}
