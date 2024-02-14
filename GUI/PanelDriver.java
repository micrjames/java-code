import java.awt.Color;
import java.awt.Rectangle;

class PanelDriver {
   public static void main(String[] args) {
	  Rectangle frameBounds = new Rectangle(640, 480);
	  Frame frame = new Frame("Some Panels.", false, frameBounds.width, frameBounds.height, Color.white, null);

	  Panels panels = new Panels(frameBounds);
	  for(Panel panel : panels.getPanels())
		 frame.addPanel(panel);
	  frame.display();
   }
}
