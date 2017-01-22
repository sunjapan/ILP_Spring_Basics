package mypack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigClass.class);
		Employee e = (Employee) context.getBean("emp");
		System.out.println("Name: " + e.getEname());
		System.out.println("Role: " + e.getRole());
		System.out.print("Address: " + e.getAddress().getCity());
		System.out.println("- " + e.getAddress().getPincode());
	}
}