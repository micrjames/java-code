import java.awt.Color;
import com.mycompany.app.Rnd;

class RandColor {
   private Color[] colors;
   RandColor() {
	  this.colors = new Color[] {
		 Color.black,
		 Color.blue,
		 Color.cyan,
		 Color.darkGray,
		 Color.gray,
		 Color.green,
		 Color.lightGray,
		 Color.magenta,
		 Color.orange,
		 Color.pink,
		 Color.red,
		 Color.white,
		 Color.yellow
	  };
   }

   public Color getColor() {
	  return new Rnd(0, this.colors.length-1).<Color>choice(this.colors);
   }
}
