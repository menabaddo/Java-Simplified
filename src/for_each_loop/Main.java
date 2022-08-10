package for_each_loop;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// for-each = traversing technique to iterate through the elements in an array
		// or collection
		// less steps, more readable
		// less flexible

		ArrayList<String> animals = new ArrayList<String>();

		animals.add("dog");
		animals.add("cat");
		animals.add("rat");
		animals.add("mice");
//		String[] animals = { "cat", "dog", "rat", "bird" };

		for (String i : animals) {
			System.out.println(i);
		}

	}

}
