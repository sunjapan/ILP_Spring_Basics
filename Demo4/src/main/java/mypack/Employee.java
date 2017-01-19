package mypack;

public class Employee {
	private String name;
	private String role;
	private Address addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address address) {
		this.addr = address;
	}
}