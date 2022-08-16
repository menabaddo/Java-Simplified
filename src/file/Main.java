package file;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// file = An abstract representation of file and directory pathnames

		File file = new File("C:\\Users\\mmm\\Desktop\\secret_message.txt"); // passing in the name of the file as an
																				// argument
		// if the file is located outside the project
		// use the file path

		// if within the project just use the file name.

		if (file.exists()) {
			System.out.println("File exist");
			System.out.println(file.getPath()); // if the path is used it returns the path instead of the name of the //
												// // file
			System.out.println(file.getAbsolutePath()); // returns the location
			System.out.println(file.isFile());
			file.delete(); // to delete a file

		}
		else {
			System.out.println("The file doesn't exist");

		}
	}
}
