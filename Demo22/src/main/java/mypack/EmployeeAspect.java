package mypack;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
	@AfterThrowing(pointcut="execution(* mypack.Employee.displayEmpName(..))", throwing="ex")
	public void afterThrowingAdvice(Exception ex) {
		System.out.println("Exception was throw in advice:" + ex.toString());
	}

}

