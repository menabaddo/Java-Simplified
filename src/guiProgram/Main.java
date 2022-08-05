package guiProgram;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null, "Hello " + name);

		/**
		 * when using the input dialog box its going to return a string, so you have to
		 * convert the returned string to the right data type as seen in line 17
		 */

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");

		/**
		 * note the I in Integer starts with capital letter because we are accessing the
		 * class Integer in order to access the .parseInt method
		 */

		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your height? "));
		JOptionPane.showMessageDialog(null, "Your height is " + height + " cm");

	}

}
