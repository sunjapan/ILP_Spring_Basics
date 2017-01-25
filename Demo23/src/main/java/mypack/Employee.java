package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("Erin")
	private String ename;
	@Value("Manager")
	private String role;
	private double salary;
	@Autowired
	private Address address;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Name: " + getEname());
		System.out.println("Role: " + getRole());
		System.out.print("Address: " + getAddress().getCity());
		System.out.println("-" + getAddress().getPincode());
	}

	public void displayEmpName() throws Exception {
		if (getEname() == null) {
			throw new NullPointerException("Invalid Name");
		} else {
			System.out.println("Employee Name: " + getEname());
		}
	}

	public double calculateSalary(String role) {

		if (role.equals("Manager")) {
			salary = 75000;
		} else {
			salary = 50000;
		}
		return salary;
	}
}