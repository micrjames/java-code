import java.awt.Rectangle;
import java.awt.Color;
import java.util.stream.IntStream;

class Panels {
   private Rectangle[] bounds;
   private Panel[] panels;
   private int n;
   Panels(Rectangle frameBounds, int n) {
	  this.n = n;
	  this.bounds = new Rectangle[this.n*this.n];
      this.panels = new Panel[this.n * this.n];

	  this.setBounds(frameBounds);
	  this.setPanels();
   }
   private void setBounds(Rectangle frameBounds) {
	  IntStream.range(0, this.bounds.length).forEach(index -> {
		 this.bounds[index] = new Rectangle(
			   (index * frameBounds.width/this.n)%frameBounds.width,
			   (int)(Math.floor(index / this.n) * (frameBounds.height/this.n)),
			   frameBounds.width/this.n,
			   frameBounds.height/this.n
		 );
	  });
   }
   private void setPanels() {
	  IntStream.range(0, this.panels.length).forEach(index -> {
		 panels[index] = new Panel(bounds[index], new RandColor().getColor());
	  });
   }
   Panel[] getPanels() {
	  return this.panels;
   }
}
