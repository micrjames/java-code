import java.awt.Color;
import javax.swing.JLabel;

class FrameDriver {
   public static void main(String []args) {
	  Frame frame = new Frame("A Frame.", false, 640, 480, new Color(123, 50, 250));

	  frame.addLabel(new Label("Hello, World!", Color.black, 30, true));
	  frame.display();
   }
}
