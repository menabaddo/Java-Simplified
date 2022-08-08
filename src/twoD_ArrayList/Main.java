package twoD_ArrayList;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// 2D ArrayList = a dynamic list of lists
		// You can change the size of the list during runtime

		ArrayList<ArrayList<String>> groceryList = new ArrayList();

		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("milk");
		bakeryList.add("pie");

		ArrayList<String> spice = new ArrayList();
		spice.add("pepper");
		spice.add("cameroon pepper");
		spice.add("black pepper");

		ArrayList<String> drink = new ArrayList();
		drink.add("fanta");
		drink.add("coke");
		drink.add("pepsi");

		groceryList.add(bakeryList);
		groceryList.add(spice);
		groceryList.add(drink);

		System.out.println(groceryList.get(0).get(0));
		// .get().get() to get the inner element of the list

//		System.out.println(bakeryList);
//		System.out.println(spice);
	}

}
