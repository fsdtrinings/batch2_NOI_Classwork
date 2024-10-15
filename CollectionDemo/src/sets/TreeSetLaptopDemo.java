package sets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TreeSetLaptopDemo {

	public static void main(String[] args) {

		TreeSet<Laptop> set = new TreeSet<>();

		Laptop laptop1 = new Laptop(123, "Dell", 2000, 8);
		Laptop laptop2 = new Laptop(789146, "HP", 2000, 16);
		Laptop laptop3 = new Laptop(456177, "Apple", 8000, 4);
		Laptop laptop4 = new Laptop(14562, "Dell", 2000, 8);
		Laptop laptop5 = new Laptop(1230, "Lenovo", 1998, 8);

		set.add(laptop1);
		set.add(laptop2);
		set.add(laptop3);
		set.add(laptop4);
		set.add(laptop5);

		new TreeSetLaptopDemo().display(set);

		// --------- code to sort by Cost low to High -------------------

		// collections.sort method can take only list
		// Step 1 : convert Set to List
		List<Laptop> temp = new ArrayList<>(set);
		// Step 2: Call sorting operation
		Collections.sort(temp, new SortByCostLowToHigh());
		new TreeSetLaptopDemo().display(temp);

		// --------- code to sort by Cost High to Low -------------------

		// collections.sort method can take only list
		// Step 1 : convert Set to List
		List<Laptop> temp2 = new ArrayList<>(set);
		// Step 2: Call sorting operation
		Collections.sort(temp2, new SortByCostHighToLow());
		new TreeSetLaptopDemo().display(temp2);

	}
	/*
	 * public void display(Collection<Integer> data) { for (Object object : data) {
	 * System.out.println(object.toString()); } }
	 */

	public void display(Collection<?> data) {
		System.out.println("--------------");
		for (Object object : data) {
			System.out.println(object.toString());
		}
	}

}
