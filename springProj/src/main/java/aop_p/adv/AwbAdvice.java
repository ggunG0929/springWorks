package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AwbAdvice {
	// <aop:before method="js" pointcut="within(aop_p.webToon.Josuk)" />
	void js(JoinPoint joinPoint) {
		System.out.println("js: "+joinPoint.getSignature().toShortString());
	}
	// <aop:before method="kkbbdd" pointcut="bean(kbd)" />
	void kkbbdd(JoinPoint joinPoint) {
		System.out.println("kkbbdd: "+joinPoint.getSignature().toShortString());
	}
	
	
	
	//---------------------------

	// <aop:before method="qw" pointcut="args(qq,ww)" />
	// 오류남
//	void qw(JoinPoint joinPoint) {
	// 변수라는 것을 지정해줘야함
	void qw(JoinPoint joinPoint, int qq, String ww) {
		System.out.println("qw(int, String): "+joinPoint.getSignature().toShortString());
	}
	
	// 자료형이 다르기 때문에 적용이 안됨
	void zx(JoinPoint joinPoint, int zz, int xx) {
		System.out.println("zx(int, int): "+joinPoint.getSignature().toShortString());
	}
	
	// int인수가 하나인 papa에 적용됨
	void cccc(JoinPoint joinPoint, int cc) {
		System.out.println("cccc(int): "+joinPoint.getSignature().toShortString());
	}
//	
//	// <aop:pointcut id="classKang" expression="execution(public * aop_p.webToon.Kang*.* (..))" /><aop:after method="claKang" pointcut-ref="classKang" />
//	void claKang(JoinPoint joinPoint) {
//		System.out.println("claKang: "+joinPoint.getSignature().toShortString());
//	}
//	
//	// <aop:after method="endO" pointcut="execution(public * aop_p.webToon.*.*o (..))" />	
//	void endO(JoinPoint joinPoint) {
//		System.out.println("endO: "+joinPoint.getSignature().toShortString());
//	}
//
//	// <aop:after method="oAndKang" pointcut="execution(public * aop_p.webToon.*.*o (..)) and execution(public * aop_p.webToon.KangBada.* (..))" />
//	void oAndKang(JoinPoint joinPoint) {
//		System.out.println("oAndKang: "+joinPoint.getSignature().toShortString());
//	}
//	
//	// <aop:after method="oOrJo" pointcut="execution(public * aop_p.webToon.*.*o (..)) or execution(public * aop_p.webToon.Jo*.* (..))" />
//	void oOrJo(JoinPoint joinPoint) {
//		System.out.println("oOrJo: "+joinPoint.getSignature().toShortString());
//	}
	
}