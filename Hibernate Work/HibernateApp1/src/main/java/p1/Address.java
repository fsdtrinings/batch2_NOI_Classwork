package p1;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String houseAddress;
	private String city;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String houseAddress, String city, String state) {
		super();
		this.houseAddress = houseAddress;
		this.city = city;
		this.state = state;
	}
	public String getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
