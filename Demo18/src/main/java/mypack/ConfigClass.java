package mypack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
	@Bean
	CourseReg creg() {
		CourseReg cr = new CourseReg();
		cr.setCname("Maths");
		cr.setCcode("101");
		cr.setStud(student()); // Setter Injection
		return cr;
	}

	@Bean
	Address address() {
		Address address = new Address("Bangalore", 560082); // Constructor
															// Injection
		return address;
	}

	@Bean
	Student student() {
		Student s = new Student();
		s.setName("Smith");
		s.setAddress(address()); // Setter Injection
		return s;

	}

}