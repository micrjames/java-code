import javax.swing.JFrame;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame extends JFrame {
   Frame(String title, boolean resizable, int width, int height, Color color, LayoutManager layout) {

	  this.setTitle(title);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setResizable(resizable);
	  this.setSize(width, height);

	  this.getContentPane().setBackground(color);
	  this.setLayout(layout);
   }

   public void addLabel(JLabel label) {
	  this.add(label); 
   }
   public void addPanel(JPanel panel) {
	  this.add(panel);
   }

   public void display() {
	  this.setVisible(true);
   }
}
