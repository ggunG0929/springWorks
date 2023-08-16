package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class ExecAdvice1 {
	// pointcut="execution(public String aop_p.webToon..* (..))"
	void retString(JoinPoint joinPoint) {
		System.out.println("retString: "+joinPoint.getSignature().toShortString());
	}
	
	// pointcut="execution(public String aop_p.webToon..* (int, ..))
	void paramInt(JoinPoint joinPoint) {
		System.out.println("paramInt: "+joinPoint.getSignature().toShortString());
	}

	// <aop:pointcut id="dog" expression="execution(public String aop_p.webToon..dog* (..))" /><aop:before method="nameDog" pointcut-ref="dog" />
	void nameDog(JoinPoint joinPoint) {
		System.out.println("nameDog: "+joinPoint.getSignature().toShortString());
	}
	
	// <aop:pointcut id="classKang" expression="execution(public * aop_p.webToon.Kang*.* (..))" /><aop:after method="claKang" pointcut-ref="classKang" />
	void claKang(JoinPoint joinPoint) {
		System.out.println("claKang: "+joinPoint.getSignature().toShortString());
	}
	
	// <aop:after method="endO" pointcut="execution(public * aop_p.webToon.*.*o (..))" />	
	void endO(JoinPoint joinPoint) {
		System.out.println("endO: "+joinPoint.getSignature().toShortString());
	}

	// <aop:after method="oAndKang" pointcut="execution(public * aop_p.webToon.*.*o (..)) and execution(public * aop_p.webToon.KangBada.* (..))" />
	void oAndKang(JoinPoint joinPoint) {
		System.out.println("oAndKang: "+joinPoint.getSignature().toShortString());
	}
	
	// <aop:after method="oOrJo" pointcut="execution(public * aop_p.webToon.*.*o (..)) or execution(public * aop_p.webToon.Jo*.* (..))" />
	void oOrJo(JoinPoint joinPoint) {
		System.out.println("oOrJo: "+joinPoint.getSignature().toShortString());
	}
	
}