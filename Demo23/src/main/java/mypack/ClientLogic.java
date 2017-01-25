package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Employee e = (Employee) context.getBean("employee");
		String role = e.getRole();
		System.out.println("main method Total Salary :"
				+ e.calculateSalary(role));
	}
}