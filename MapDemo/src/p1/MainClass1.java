package p1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainClass1 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Dell", 12000);
		map.put("Apple", 2000);
		map.put("Lenovo", 45000);
		map.put("HP", 1000);
		
		
		// #1 
		System.out.println(map);
		System.out.println("----------------------------------------\n");
		//#2
		for (Map.Entry<String, Integer> entry : map.entrySet()) 
		{
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			if(value>10000)			
				System.out.println(key+"- "+value);
		}
		
		
		// --- #3 
		System.out.println("----------------------------------------\n");
		
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext())
		{
			String keyObj = itr.next();
			Integer value = map.get(keyObj);
			System.out.println(keyObj+"- "+value);
			
		}
		
		
		
	}//end main
	
}//end class







