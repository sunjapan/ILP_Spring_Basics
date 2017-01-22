package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientLogic {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigClass.class);
		Employee e1 = (Employee) context.getBean("employee");
		System.out
				.println("-----First time instatiation of Employee bean details------");

		System.out.println("Name: " + e1.getEname());
		System.out.println("Role: " + e1.getRole());
		System.out.print("Address: " + e1.getAddress().getCity());
		System.out.println("- " + e1.getAddress().getPincode());

		e1.setEname("Bob");
		e1.setRole("TL");

		Address addr1 = (Address) context.getBean("address");
		addr1.setCity("Pune");
		addr1.setPincode(42004324);
		e1.setAddress(addr1);
		System.out
				.println("-----Same instance details after modification------");
		System.out.println("Name: " + e1.getEname());
		System.out.println("Role: " + e1.getRole());
		System.out.print("Address: " + e1.getAddress().getCity());
		System.out.println("- " + e1.getAddress().getPincode());

		Employee e2 = (Employee) context.getBean("employee");
		System.out
				.println("-----Second time access to Employee bean details------");
		System.out.println("Name: " + e2.getEname());
		System.out.println("Role: " + e2.getRole());
		System.out.print("Address: " + e2.getAddress().getCity());
		System.out.println("- " + e2.getAddress().getPincode());
	}
}