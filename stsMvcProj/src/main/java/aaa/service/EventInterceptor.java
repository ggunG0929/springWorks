package aaa.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 인터페이스 HandlerInterceptor add 하여 생성
@Service
public class EventInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception {

		System.out.println("preHandle 진입");
		
//		Date chkDay = new Date(2023-1900, 8-1, 28);	// true
		Date chkDay = new Date(2023-1900, 7-1, 28);	// false
		Date today = new Date();
		
		// 체크데이가 오늘보다 이전이면
		if(chkDay.before(today)) {
			
			response.sendRedirect("/event/faaail");
			return false;	// false일때는 페이지를 아예 진입하지를 않음. pre핸들이어서 페이지 실행전에 걸려서 확인함
		}
		return true;

		//		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
}
