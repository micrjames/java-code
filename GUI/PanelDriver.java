import java.awt.Color;
import java.awt.Rectangle;

class PanelDriver {
   public static void main(String []args) {
	  Rectangle frameBounds = new Rectangle(640, 480);
	  Rectangle panelBounds[] = {
		 new Rectangle(0, 0, frameBounds.width/2, frameBounds.height/2),
		 new Rectangle(frameBounds.width/2, 0, frameBounds.width/2, frameBounds.height/2),
		 new Rectangle(0, frameBounds.height/2, frameBounds.width/2, frameBounds.height/2),
		 new Rectangle(frameBounds.width/2, frameBounds.height/2, frameBounds.width/2, frameBounds.height/2)
	  };
	  Frame frame = new Frame("Some Panels.", false, frameBounds.width, frameBounds.height, Color.white, null);

	  frame.addPanel(new Panel(panelBounds[0], Color.green));
	  frame.addPanel(new Panel(panelBounds[1], Color.yellow));
	  frame.addPanel(new Panel(panelBounds[2], Color.blue));
	  frame.addPanel(new Panel(panelBounds[3], Color.red));
	  frame.display();
   }
}
