package Panel;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Rectangle;

public class Panel extends JPanel {
   public Panel(Rectangle rect, Color color) {
	  this.setBackground(color);
	  this.setBounds(rect.x, rect.y, rect.width, rect.height);
   }

   public <T> void add(T component) {
	  this.add(component);
   }
}
