package p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapClass2 {

	public static void main(String[] args) {
		
		Map<String, List<Laptop>> map = new HashMap<>();
		
		// ----- Sample data ----
		
		List<Laptop> allDellLaptops = new ArrayList<>();
		
		Laptop l1 =  new Laptop("Dell",2000, 60);
		Laptop l2 =  new Laptop("Dell",2800, 50);
		Laptop l3 =  new Laptop("Dell",3000, 20);
		
		List<Laptop> allHpLaptops = new ArrayList<>();
		
		Laptop l4 =  new Laptop("HP",5800, 44);
		Laptop l5 =  new Laptop("HP",17600, 13);
		
		
		List<Laptop> allAppleLaptops = new ArrayList<>();
		
		Laptop l6 =  new Laptop("Apple",12000, 160);
	
		
		
		// --- Sample Data -----
		
		
		map.put("Dell", allDellLaptops);
		map.put("HP", allHpLaptops);
		map.put("Apple", allAppleLaptops);
		
		
	}

	/* get all laptops where brand is {HP} and cost more than {10000}*/
	public List<Laptop> doFilter(Map<String, List<Laptop>> map,String filterBrand,int filterCost)
	{
		
		List<Laptop> temp = new ArrayList<>();
		
		for (Map.Entry<String, List<Laptop>> entry:map.entrySet())
		{
			String key = entry.getKey();
			if(key.equalsIgnoreCase(filterBrand))
			{
				List<Laptop> allLaptops = entry.getValue();
				
				for (Laptop laptop : allLaptops) {
					
					if(laptop.getCost()>filterCost)
					{
						temp.add(laptop);
					}
				}
			}
			
		}
		return temp;
	}
	
}
























