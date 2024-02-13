import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

class Label extends JLabel {
   Label(String text, Color color, int fontSize, boolean centered) {
	  this.setText(text);
	  this.setForeground(color);
	  if(centered)
		 this.setHorizontalAlignment(SwingConstants.CENTER);
	  this.setFont(new Font("Plain", Font.PLAIN, fontSize));
   }
}
