package Frame;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.LayoutManager;

public class Frame extends JFrame {
   public Frame(String title, boolean resizable, int width, int height, Color color, LayoutManager layout) {

	  this.setTitle(title);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setResizable(resizable);
	  this.setSize(width, height);

	  this.getContentPane().setBackground(color);
	  if(layout != null)
		 this.setLayout(layout);
   }

   public <T> void add(T component) {
	  this.add(component); 
   }

   public void display() {
	  this.setVisible(true);
   }
}
