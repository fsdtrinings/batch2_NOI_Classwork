package sets;

import java.util.Objects;

// step 1 : for default sorting : implement Comprable<X>
public class Laptop implements Comparable<Laptop>
{
	private int serialNo;
	private String brandName;
	private int cost;
	private int ram;
	
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Laptop(int serialNo, String brandName, int cost, int ram) {
		super();
		this.serialNo = serialNo;
		this.brandName = brandName;
		this.cost = cost;
		this.ram = ram;
	}

	

	public int getSerialNo() {
		return serialNo;
	}


	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
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
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	

	
	
	@Override
	public String toString() {
		return "Laptop [serialNo=" + serialNo + ", brandName=" + brandName + ", cost=" + cost + ", ram=" + ram + "]";
	}


	@Override
	public int hashCode() {
		// 1000
		//System.out.println("Inside hashcode "+brandName);
		return brandName.length()+cost;
	}
	@Override
	public boolean equals(Object obj) {
		
		
		//System.out.println("Inside equals : "+brandName);
		if(obj instanceof Laptop)
		{
			
			Laptop laptop2 = (Laptop)obj;
			
			boolean a = this.getBrandName().equals(laptop2.getBrandName());
			boolean b = this.cost == laptop2.cost;
			boolean c = this.ram == laptop2.ram;
			boolean d = this.serialNo == laptop2.serialNo;
			
			return a&&b&&c&&d;
		}
		else return false;
		
		
	}

	@Override
	public int compareTo(Laptop laptop2) {
		
		return this.serialNo - laptop2.serialNo;
	}
	
	

}//end class






















