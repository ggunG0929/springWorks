package aop_p.adv;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	
	// 메이븐에서 스프링부트스타터AOP를 pom.xml에 추가해야 함
	Object arTest(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		//  >> arTest 진입: execution(String aop_p.webToon.JoSuk.dog1())
		//  >> arTest 진입: execution(String aop_p.webToon.JoSuk.dog1(int,String))
		System.out.println(" >> arTest 진입: "+joinPoint.toString());
		
		//  >> ShortString: execution(JoSuk.dog1())
		//  >> ShortString: execution(JoSuk.dog1(..))
		System.out.println(" >> ShortString: "+joinPoint.toShortString());
		
		// >> getSignature: String aop_p.webToon.JoSuk.dog1()
		// >> getSignature: String aop_p.webToon.JoSuk.dog1(int,String)
		System.out.println(" >> getSignature: "+joinPoint.getSignature());
		
		//  >> getSignature().getName(): dog1
		//  >> getSignature().getName(): dog1
		System.out.println(" >> getSignature().getName(): "+joinPoint.getSignature().getName());
		
		//  >> getSignature().toShortString(): JoSuk.dog1()
		//  >> getSignature().toShortString(): JoSuk.dog1(..)
		System.out.println(" >> getSignature().toShortString(): "+joinPoint.getSignature().toShortString());
		
		//  >> getTarget(): aop_p.webToon.JoSuk@1d8062d2
		System.out.println(" >> getTarget(): "+joinPoint.getTarget());
		
		//  >> getThis(): aop_p.webToon.JoSuk@1d8062d2
		System.out.println(" >> getThis(): "+joinPoint.getThis());
		
		//  >> getArgs(): [Ljava.lang.Object;@1e63ec0b
//		System.out.println(" >> getArgs(): "+joinPoint.getArgs());
		
		//  >> getArgs(): [12, 아기상어]
		System.out.println(" >> getArgs(): "+Arrays.toString(joinPoint.getArgs()));
		
		try {
			
			if(joinPoint.getArgs().length>=2) {
				joinPoint.getArgs()[1] = "엄마상어";
				
				//  >>변경한 getArgs(): [12, 엄마상어]
				System.out.println(" >>변경한 getArgs(): "+Arrays.toString(joinPoint.getArgs()));
			}
			
			res = joinPoint.proceed();	// res로 정의-null 없어짐	// surround with try catch
			
			// arTest 완료 후 jsk.wife:조준
			if(res.equals("애봉")) {
				res = "조준";
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println(" >> arTest 완료");
		
		return res;
	}

}
