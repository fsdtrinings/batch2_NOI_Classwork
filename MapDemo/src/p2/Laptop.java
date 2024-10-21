package p2;

import java.util.Objects;

public class Laptop {

	String brandName;
	int cost;
	int units;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String brandName, int cost, int units) {
		super();
		this.brandName = brandName;
		this.cost = cost;
		this.units = units;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brandName, cost, units);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(brandName, other.brandName) && cost == other.cost && units == other.units;
	}
	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + ", cost=" + cost + ", units=" + units + "]";
	}
	
	
}
