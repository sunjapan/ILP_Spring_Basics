package mypack;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	private String city;
	int pincode;

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