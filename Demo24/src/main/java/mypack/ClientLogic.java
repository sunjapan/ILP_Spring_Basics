package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigClass.class);
		Employee e = (Employee) context.getBean("employee");
		e.display();
	}
}