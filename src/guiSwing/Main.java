package guiSwing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame(); // create frame
		frame.setVisible(true);// makes frame visible
		frame.setSize(500, 500); // size of frame x and y axis
		frame.setTitle("Jframe title goes here");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon image = new ImageIcon("lexo.png"); // create an image icon
		frame.setIconImage(image.getImage()); // change icon of frame
		frame.getContentPane().setBackground(new Color(123, 50, 250)); // change color of background
		// you could also use hexa-decimals also
	}

}
