import java.awt.Color;
import com.mycompany.app.Rnd;

class RandColor {
   private static Color[] colors;
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

   public static Color getColor() {
	  return new Rnd().<Color>choice(RandColor.colors);
   }
}
