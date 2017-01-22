package mypack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigClass.class);
		CourseReg register = (CourseReg) context.getBean("creg");
		System.out.println(register);
	}
}