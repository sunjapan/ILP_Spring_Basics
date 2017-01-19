package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Employee e = (Employee) context.getBean("employee");
		System.out.println("Name: " + e.getName());
		System.out.println("Role: " + e.getRole());
		System.out.print("Address: " + e.getAddr().getCity());
		System.out.println("-" + e.getAddr().getPincode());

	}
}