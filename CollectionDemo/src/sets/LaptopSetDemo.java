package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LaptopSetDemo {

	public static void main(String[] args) {
		
		Set<Laptop> set = new LinkedHashSet<>();
		
		Laptop laptop1 = new Laptop(123,"Dell", 2000, 8);
		Laptop laptop2 = new Laptop(789146,"HP" ,2000, 16);
		Laptop laptop3 = new Laptop(456177,"Apple", 8000, 4);
		Laptop laptop4 = new Laptop(14562,"Dell", 2000, 8);
		Laptop laptop5 = new Laptop(1230,"Lenovo", 1998, 8);
		
		set.add(laptop1);
		set.add(laptop2);
		set.add(laptop3);
		set.add(laptop4);
		set.add(laptop5);
		
		System.out.println("\n------------------\n");
		for (Laptop laptop : set) {
			System.out.println(laptop);
		}
		
		
		
	}
	
}
