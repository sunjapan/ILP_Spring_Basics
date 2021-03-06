package mypack;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
	@Before("execution(* mypack.Employee.display(..))")
	public void beforeAdvice() {
		System.out.println("Before Advice");
	}

	@After("execution(* mypack.Employee.display(..))")
	public void afterAdvice() {
		System.out.println("After Advice");
	}
}