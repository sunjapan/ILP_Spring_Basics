package mypack;

public class Employee {
	private String ename;
	private String role;
	private Address addr;

	public Employee(String ename, String role, Address address) {
		this.ename = ename;
		this.role = role;
		this.addr = address;
	}

	public String getName() {
		return ename;
	}

	public void setName(String ename) {
		this.ename = ename;
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