package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

		// JPanel = a GUI component that functions as a container to hold other
		// components

		JPanel redPanel = new JPanel(); // creating a panel
		JPanel bluePanel = new JPanel(); // creating a panel
		JPanel greenPanel = new JPanel(); // creating a panel

		JLabel label = new JLabel();
		ImageIcon icon = new ImageIcon("OIP (4).jpg");
		bluePanel.setLayout(new BorderLayout()); // using border layout

		label.setText("Hi");
		label.setIcon(icon);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setFont(new Font("MV Boli", Font.BOLD, 20));
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);

		redPanel.setBackground(Color.RED);
		redPanel.setLayout(null);
		label.setBounds(50, 50, 100, 100); // using null layout
		redPanel.add(label);

//		bluePanel.add(label); // adding label to redpanel container
		//panel layout uses flow layout by default
		bluePanel.setBackground(Color.BLUE);
		greenPanel.setBackground(Color.GREEN);


		redPanel.setBounds(0, 0, 250, 250);
		bluePanel.setBounds(250, 0, 500, 250);
		greenPanel.setBounds(0, 250, 750, 500);



		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750, 750);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);

	}

}
