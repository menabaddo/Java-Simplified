package label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImageIcon image = new ImageIcon("logit_logo3.PNG"); // file name is used if it's in the same project folder
		Border border = BorderFactory.createLineBorder(Color.GREEN, 3); // creating a border and passing some properties
																		// during creation

		// JLabel = a GUI display area for a string of text, an image or both
		JLabel label = new JLabel(); // text could also be passed in here //create label
		label.setText("Jesus is the greatest"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text, LEFT, CENTER, RIGHT of image icon
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.GREEN); // set font color
		label.setFont(new Font("MV Boli", Font.PLAIN, 40)); // set font style
		label.setIconTextGap(-10); // set gap of text to image
		label.setBackground(Color.BLACK); // set the background color
		label.setOpaque(true); // display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon and text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set Horizontal position of icon+text within label
		// label.setBounds(100, 100, 250, 250); //this will set x,y position within
		// frame as well as dimensions

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(500, 500);
		// frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		// ensure you add all your components before using pack method

		frame.pack(); // it makes the frame adjust to whatever that is within the label


	}

}
