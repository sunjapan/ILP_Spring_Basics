package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Object obj = context.getBean("welcomeBean");
		WelcomeBean wb = (WelcomeBean) obj;
		wb.show();
	}
}