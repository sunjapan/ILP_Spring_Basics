package mypack;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
	@AfterReturning(pointcut = "execution(* mypack.Employee.get*(..))", returning = "rvalue")
	public void afterReturningAdvice(String rvalue) {
		System.out.println("Return value in advice:" + rvalue);
	}

}