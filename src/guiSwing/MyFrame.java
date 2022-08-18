package guiSwing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame() {

		// basically you can create a frame by making MyFrame a child class of JFrame
		// using a constructor with the this keyword

		this.setVisible(true);// makes this visible
		this.setSize(500, 500); // size of this x and y axis
		this.setTitle("Jframe title goes here");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon image = new ImageIcon("lexo.png"); // create an image icon
		this.setIconImage(image.getImage()); // change icon of this
		this.getContentPane().setBackground(new Color(123, 50, 250)); // change color of background
		// you could also use hexa-decimals also
	}

}
