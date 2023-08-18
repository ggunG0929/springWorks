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
	int sum1=0, sum2=0;
	int cnt0;
	@Around("args(aa, bb)")
	Object dup(ProceedingJoinPoint joinPoint, String aa, int bb) {
		Object res = null;
		try {
			res = joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("덮지나가욥");
		return res;
	}
	@Around("args(aa, cc, bb)")
	Object jji(ProceedingJoinPoint joinPoint, String aa, String cc, int bb) {
		Object res = null;
		try {
			joinPoint.proceed();
			Food f = (Food)joinPoint.getTarget();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("지나가욥");
		return res;
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