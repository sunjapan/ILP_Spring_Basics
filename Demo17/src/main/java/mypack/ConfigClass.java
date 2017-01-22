package mypack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigClass {
	@Bean
	@Scope("singleton")
	Address address() {
		// Constructor Injection
		Address address = new Address("Bangalore", 560082);
		return address;
	}

	@Bean
	@Scope("prototype")
	Employee employee() {
		Employee e = new Employee();
		e.setEname("Smith");
		e.setRole("TA");
		e.setAddress(address()); // Setter Injection
		return e;
	}
}