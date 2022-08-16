package fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// FileReader = read the contents of a file as a stream of characters. One by
		// one
		// read() returns an int value which contains the byte value when read() returns
		// -1,
		// there is no more data to be read.

		try {
			FileReader reader = new FileReader("poem.txt");
			int data = reader.read();
			System.out.println(data);

			while (data != -1) {
				System.out.print((char) data); // read returns the byte value and stores it in an integer
				data = reader.read();

			}

		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");

		}

	}

}
