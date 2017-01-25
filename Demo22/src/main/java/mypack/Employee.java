package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
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

	public void displayEmpName() throws Exception {
		if (this.getEname() == null) {
			throw new Exception("Invalid name");
		}else{
			System.out.println("Employee name: "+getEname());
		}
	}
}