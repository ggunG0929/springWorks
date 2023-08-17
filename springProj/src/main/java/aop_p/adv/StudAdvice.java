package aop_p.adv;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import aop_p.model.GreenStud;
import aop_p.model.StudRes;
import jakarta.annotation.Resource;

@Component
public class StudAdvice {
	
	// 제일 중요한 작업!! DI를 활용할 줄 알아야 한다
	@Resource
	StudRes sRes;

	Object employee(ProceedingJoinPoint joinPoint, int qq, int ww) {
		Object res = null;
		
		try {
			joinPoint.proceed();
			
			// RedStud를 적용하여 Green과 Red를 구분하려면 상속해서 return값에 따라 구분되는 것이 좋음
			GreenStud gs = (GreenStud)joinPoint.getTarget();
			gs.kind = "직장인";
				
			sRes.add(gs);
			//System.out.println("sRes:"+sRes);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	Object general(ProceedingJoinPoint joinPoint, int qq, int ww, int tt) {
		Object res = null;
		
		try {
			joinPoint.proceed();
			
			GreenStud gs = (GreenStud)joinPoint.getTarget();
			gs.kind = "일반";
			sRes.add(gs);
			//System.out.println("sRes:"+sRes);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	Object spec(ProceedingJoinPoint joinPoint, int qq, int ww, int tt, int aa) {
		Object res = null;
		
		try {
			joinPoint.proceed();
			
			GreenStud gs = (GreenStud)joinPoint.getTarget();
			gs.kind = "예체능";	
			sRes.add(gs);
			//System.out.println("sRes:"+sRes);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
}
