package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Employee s = (Employee) context.getBean("Employee");
		System.out.println("Employee Name: " + s.getName());
		System.out.println("Employee Role: " + s.getRole());
		System.out.print("Address: " + s.getAddress().getCity());
		System.out.println("-" + s.getAddress().getPincode());
	}
}