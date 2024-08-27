import java.util.*;

class ThreadDemo extends Thread {
   private Runnable callback;

   public void run() {
	  /*
	  new Thread(new Runnable() {
		 public void run() {
			new Thread(callback).start();
		 }
	  }).start();
	  */
	  new Thread(callback).start();
   }

   public ThreadDemo do_for_data(final Runnable callback) {
	  this.callback = callback;

	  return this;
   }
}
