package arrayOfObject;

public class Main {


	public static void main(String[] args) {

//		int[] numbers = new int[2];
//		char[] characters = new char[2];
//		String[] strings = new String[2];

//		Food[] refrigerator = new Food[3];

		Food food1 = new Food("Rice");
		Food food2 = new Food("Pizza"); // created 3 objects of the class Food
		Food food3 = new Food("Beans");

		Food[] refrigerator = { food1, food2, food3 }; // added three objects to the array, making it an array of object

		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;

		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);

		// .name is needed to access the name attribute of the object food1

	}

}
