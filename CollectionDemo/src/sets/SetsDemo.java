package sets;

import java.util.HashSet;
import java.util.Set;

public class SetsDemo {

	
	public static void main(String[] args) {
		
		Set<Character> set = new HashSet<>();
		
		set.add('a');
		set.add('n');
		set.add('b');
		set.add('a');
		set.add('c');
		
		System.out.println(set);
		System.out.println(set.size());
		
	}//end main
	
}//end class
