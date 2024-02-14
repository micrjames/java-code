import java.awt.Rectangle;
import java.awt.Color;

class Panels {
   private Rectangle[] bounds;
   private Panel[] panels;
   Panels(Rectangle frameBounds) {
	  this.bounds = new Rectangle[] {
		 new Rectangle(0, 0, frameBounds.width/2, frameBounds.height/2),
		 new Rectangle(frameBounds.width/2, 0, frameBounds.width/2, frameBounds.height/2),
		 new Rectangle(0, frameBounds.height/2, frameBounds.width/2, frameBounds.height/2),
		 new Rectangle(frameBounds.width/2, frameBounds.height/2, frameBounds.width/2, frameBounds.height/2)
	  };
      this.panels = new Panel[] {
		 new Panel(this.bounds[0], new RandColor().getColor()),
		 new Panel(this.bounds[1], new RandColor().getColor()),
		 new Panel(this.bounds[2], new RandColor().getColor()),
		 new Panel(this.bounds[3], new RandColor().getColor())
	  };
   }
   Panel[] getPanels() {
	  return this.panels;
   }
}
