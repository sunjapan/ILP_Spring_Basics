package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//Explicit bean name “emp” is specified through @Component.
@Component("emp")
public class Employee {
	// @Value annotation is used to provide initialization values
	@Value("John")
	private String ename;
	@Value("Senior Software Engineer")
	private String role;
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

}