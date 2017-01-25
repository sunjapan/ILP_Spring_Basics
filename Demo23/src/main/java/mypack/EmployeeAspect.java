package mypack;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
	@Around("execution(* mypack.Employee.calculateSalary(String))")
	public double performanceIncentive(ProceedingJoinPoint pjp)
			throws Throwable {
		System.out.println("Around Advice:before business method");
		Object retVal = pjp.proceed();
		System.out.println("Around Advice:after business method");
		double salary = ((Double) retVal).doubleValue();
		Object[] args = pjp.getArgs();
		String role = args[0].toString();
		if (role.equals("Manager")) {
			salary = (salary + (0.25 * salary));
		} else {
			salary = (salary + (0.2 * salary));
		}
		return salary;
	}
}