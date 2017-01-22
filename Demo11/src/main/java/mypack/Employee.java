package mypack;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String ename;
	private String role;
	private Address address;

	@Autowired
	public Employee(String ename, String role, Address address) {
		this.ename = ename;
		this.role = role;
		this.address = address;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}