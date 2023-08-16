package exer9;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	
	// 메이븐에서 스프링부트스타터AOP를 pom.xml에 추가해야 함
	Object arTest(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		try {
			res = joinPoint.proceed();	// res로 정의-null 없어짐	// surround with try catch
			
			if(Integer.parseInt(((String)res).substring(0,2)) <= 20) {
				System.out.println("풀어주자");
				res = null;
			}
				
//			if(joinPoint.getArgs()[0]==null) {
//				return "미끼를 넣으세요";
//			}
//			if((int)joinPoint.getArgs()[1]<=20) {
//				System.out.println("풀어주자");
//				res = null;
//			}
			
		} catch (Throwable e) {
//			e.printStackTrace();
		}
		
		return res;
	}

}
