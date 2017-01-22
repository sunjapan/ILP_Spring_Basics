package mypack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
	@Bean
	Address address() {
		Address address = new Address("Bangalore", 560082);
		return address;
	}

	@Bean
	Employee emp() {
		Employee e = new Employee();
		e.setEname("Smith");
		e.setRole("TA");
		e.setAddress(address());
		return e;
	}
}