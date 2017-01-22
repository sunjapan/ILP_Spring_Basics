package mypack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Mysore")
	private String city;
	@Value("560001")
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
    @Override
    public String toString() {
        return "[City=" + getCity() + ", Pincode=" + getPincode() + "]";
    }
}