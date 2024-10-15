package p1;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		// Animal a = new Dog();
		List<String> list = new ArrayList<>();
		
		list.add("Hello");
		list.add("java");
		list.add("extends");
		list.add("implements");
		list.add("spring");
		
		
		// ------ approach 1 ----
		System.out.println(list);
		System.out.println("--------------------------------------");
		// --- approach 2 ---
		for (String listItem : list) {
			System.out.println(listItem);
		}
		
		System.out.println("--------------------------------------");
		// ------ approach 3 -----
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			String data = itr.next();
			System.out.println(data);
		}
		
		
		
		
	}
}
