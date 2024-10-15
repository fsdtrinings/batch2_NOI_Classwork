package sets;

import java.util.Comparator;

public class SortByCostHighToLow implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
	
		return o1.getCost() - o2.getCost();
	}

	
}
