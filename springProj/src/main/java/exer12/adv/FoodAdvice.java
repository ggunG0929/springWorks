package exer12.adv;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import exer12.model.Food;

// 가능하지만 용어상의 편의상으로 Service로 주로 사용
//@Component
@Service
@Aspect
public class FoodAdvice {
	@Pointcut("execution(* exer12..* (..))")
	void pc() {}
	
	@After("pc()")
	void afterrr(JoinPoint joinPoint) {
		System.out.println(">>>afterrr: "+joinPoint.getSignature().toShortString());
	}
	@Before("args(aa, bb)")
	Object dup(JoinPoint joinPoint, int aa, int bb) {
		System.out.println("지나가욥");
		return "덮밥이지롱";
	}
	@Around("args(aa, 공기밥, cc)")
	void jji(ProceedingJoinPoint joinPoint, int aa, String 공기밥, int cc) {
		System.out.println("찌개지롱");
	}
//	@Around("pc()")
//	Object arTest(ProceedingJoinPoint joinPoint) {
//		Object res = null;
//		System.out.println(" >> arTest 진입: "+joinPoint.toString());
//		
//		try {
//			res = joinPoint.proceed();	// res로 정의-null 없어짐	// surround with try catch
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(" >> arTest 완료");
//		
//		return res;
//	}
}

@Service
@Aspect
class OrderAdvice {
		
//	@Around("pc()")
//	Object arTest(ProceedingJoinPoint joinPoint) {
//		Object res = null;
//		System.out.println(" >> arTest 진입: "+joinPoint.toString());
//		
//		try {
//			res = joinPoint.proceed();	// res로 정의-null 없어짐	// surround with try catch
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(" >> arTest 완료");
//		
//		return res;
//	}
}