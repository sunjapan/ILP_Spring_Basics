package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Employee e = (Employee) context.getBean("employee");
		System.out.println("Name in main method:" + e.getEname());
		System.out.println("Role in main method:" + e.getRole());
	}
}