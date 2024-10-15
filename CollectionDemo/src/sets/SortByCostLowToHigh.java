package sets;

import java.util.Comparator;

public class SortByCostLowToHigh implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
	
		return o2.getCost() - o1.getCost();
	}

	
}
