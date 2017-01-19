package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Employee employee1 = (Employee) context.getBean("employee");
		System.out.println("Employee Name1: " + employee1.getEname());
		employee1.setEname("Bob");
		System.out.println("Employee Name1: " + employee1.getEname());
		Employee employee2 = (Employee) context.getBean("employee");
		System.out.println("Employee Name2: " + employee2.getEname());
	}
}