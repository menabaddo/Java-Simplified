package arrray_list;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayList = resizable array.
		// Elements can be added and removed after compilation phase
		// store reference data type

		ArrayList<String> food = new ArrayList<String>();

		food.add("Rice");
		food.add("Beans");
		food.add("Garri");

		food.set(0, "Yam"); // setting element

		food.remove(0);

//		food.clear(); //clears array list

		for (int i = 0; i < food.size(); i++) {
			// arrays use .length() and arraylist usse .size()

			System.out.println(food.get(i));


		}
	}

}
