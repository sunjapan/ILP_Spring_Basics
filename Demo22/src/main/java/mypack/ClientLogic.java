package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Employee e = (Employee) context.getBean("employee");
		try {
			e.displayEmpName();
		} catch (Exception e1) {
			System.out.println("Exception detected in main:"+e1.toString());
		}
	}
}