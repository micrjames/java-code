import java.util.*;

class ThreadDemo extends Thread {
   private int data;

   public void run() {
	  ask_for_data(() -> {
		 try {
			Thread.sleep(1000);
		 } catch(Exception e) {};
		 data = 42;
		 System.out.println("Async callback: " + data);
	  });
   }

   public void ask_for_data(final Runnable callback) {
	  /*
	  new Thread(new Runnable() {
		 public void run() {
			new Thread(callback).start();
		 }
	  }).start();
	  */
	  new Thread(callback).start();
   }
}
