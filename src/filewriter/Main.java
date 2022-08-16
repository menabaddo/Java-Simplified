package filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("poem.txt"); // creates file
			writer.write("Roses are red \nViolets are blue \nJesus is the greatest"); // writes to file
			writer.append("\n new line"); // appends to the end of a text in a text document
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
