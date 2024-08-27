public class Main {
   public static void main(String[] args) {
	  int data = 42;
	  new ThreadDemo()
	  .do_for_data(() -> {
		 try {
			Thread.sleep(1000);
		 } catch(Exception e) {};
		 System.out.println("Async callback: " + data);
	  }).start();
   }
}
