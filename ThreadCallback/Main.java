public class Main {
   public static void main(String[] args) {
	  ThreadDemo d = new ThreadDemo();
	  d.setData(42);
	  d.do_for_data(() -> {
		 try {
			Thread.sleep(1000);
		 } catch(Exception e) {};
		 System.out.println("Async callback: " + d.getData());
	  });
	  d.start();
   }
}
