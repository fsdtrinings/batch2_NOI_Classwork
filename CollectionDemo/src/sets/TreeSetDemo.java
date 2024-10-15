package sets;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> sortedSet1 = new TreeSet<>();
		sortedSet1.add(56);
		sortedSet1.add(6);
		sortedSet1.add(156);
		sortedSet1.add(88);
		
		new TreeSetDemo().display(sortedSet1);
		
		TreeSet<String> sortedSet2 = new TreeSet<>();
		sortedSet2.add("aab");
		sortedSet2.add("abc");
		sortedSet2.add("bac");
		sortedSet2.add("bba");
		sortedSet2.add("aac");
		sortedSet2.add("baa");
		
		
		new TreeSetDemo().display(sortedSet2);
		
		
		
	}
	/*
	public void display(Collection<Integer> data)
	{
		for (Object object : data) {
			System.out.println(object.toString());
		}
	}
	*/
	
	public void display(Collection<?> data)
	{
		System.out.println("--------------");
		for (Object object : data) {
			System.out.println(object.toString());
		}
	}
	
}
