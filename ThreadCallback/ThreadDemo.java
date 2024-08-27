import java.util.*;

class ThreadDemo extends Thread {
   private int data;
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

   public void setData(int data) {
	  this.data = data;
   }

   public int getData() {
	  return data;
   }

   public void do_for_data(final Runnable callback) {
	  this.callback = callback;
   }
}
