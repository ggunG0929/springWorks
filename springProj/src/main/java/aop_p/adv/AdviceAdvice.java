package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdviceAdvice {

	void beforeee(JoinPoint joinPoint) {
		System.out.println(">>>beforeee: "+joinPoint.getSignature().toShortString());
	}
	
	// proceeding은 around에서만 사용 가능
	// void afterrr(ProceedingJoinPoint joinPoint) {
	void afterrr(JoinPoint joinPoint) {
		System.out.println(">>>afterrr: "+joinPoint.getSignature().toShortString());
	}
	
	void returnnn(JoinPoint joinPoint, Object qq) {
		System.out.println(">>>returnnn: "+joinPoint.getSignature().toShortString()+"=> "+qq);
	}
	
	void errrr(JoinPoint joinPoint, Throwable ee) {
		System.out.println(">>>errrr: "+joinPoint.getSignature().toShortString()+"=>"+ee.getMessage());
	}

}