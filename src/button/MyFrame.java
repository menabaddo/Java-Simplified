package button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

	JButton button; // global
	JLabel label;
	ImageIcon icon2;
	MyFrame() {

		ImageIcon icon = new ImageIcon("OIP (4).jpg");
		icon2 = new ImageIcon("OIP (1).jpg");

		label = new JLabel();

		label.setBounds(100, 200, 300, 300);
		label.setVerticalTextPosition(JButton.TOP);
		label.setHorizontalTextPosition(JButton.CENTER);
		label.setFont(new Font("MV Boli", Font.BOLD, 20));
		label.setText("Welcome to the Kingdom");
		label.setIcon(icon2);
		label.setVisible(false);

		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.setText("Click Me");
		button.setIcon(icon);
		button.setFocusable(false);
		button.setVerticalTextPosition(JButton.TOP);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setFont(new Font("Comic Sans", Font.BOLD, 20));
		button.setForeground(Color.GREEN);
		button.setBackground(Color.GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());


//		button.addActionListener(e -> System.out.println("Jesus loves me") );
		// lambda expression can also be used e -> action

		button.addActionListener(this);

		// this meaning the class is implementing the ActionListener

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		this.setVisible(true);
		this.add(button);
		this.add(label);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {

			System.out.println("Jesus loves me");
			label.setVisible(true);



		}

	}

}
