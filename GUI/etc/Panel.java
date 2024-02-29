import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Rectangle;

class Panel extends JPanel {
   Panel(Rectangle rect, Color color) {
	  this.setBackground(color);
	  this.setBounds(rect.x, rect.y, rect.width, rect.height);
   }
}
