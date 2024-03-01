import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;
import java.awt.Insets;
import javax.swing.Box;
import java.awt.Dimension;

import Frame.Frame;
import Label.Label;
import Panel.Panel;
import Button.Button;

class FrameDriver {
   public static void main(String []args) {
	  Color purple = new Color(123, 50, 250);
	  Frame frame = new Frame("A Frame.", false, 640, 480, purple, null);

	  Panel panelMain = new Panel(new Rectangle(0, 0, 640, 480), purple);
	  BoxLayout boxlayout = new BoxLayout(panelMain, BoxLayout.Y_AXIS);
	  panelMain.setLayout(boxlayout);
	  // panel.setBorder(new EmptyBorder(new Insets(100, 150, 100, 150)));
	  panelMain.add(Box.createVerticalGlue());
	  panelMain.<JLabel>add(new Label("Hello, World!", Color.black, 30, true));
	  frame.<JPanel>add(panelMain);
	  Panel panelBottom = new Panel(new Rectangle(0, 0, 50, 50), Color.WHITE);
	  panelBottom.<JButton>add(new Button("click"));
	  panelMain.<JPanel>add(panelBottom);

	  frame.display();
   }
}
