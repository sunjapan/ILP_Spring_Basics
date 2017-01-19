package mypack;

public class Address {
	private String city;
	private int pincode;

	public Address(String city, int pincode) {
		this.city = city;
		this.pincode = pincode;
	}

	public Address() {
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}