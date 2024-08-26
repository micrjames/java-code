import java.util.Timer;
import java.util.TimerTask;

public class Countdown {
   public static void main(String[] args) {
	  Timer timer = new Timer();
	  TimerTask task = new TimerTask() {
		 int counter = 10;
		 @Override
		 public void run() {
			if(counter > 0) {
			   System.out.println(counter + " seconds.");
			   counter--;
			} else {
			   System.out.println("done.");
			   timer.cancel();
			}
		 }
	  };
	  timer.scheduleAtFixedRate(task, 0, 1000);
   }
}
