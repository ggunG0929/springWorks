package aaa.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.annotation.Resource;

// 인터페이스 WebMvcConfigurer add 하여 생성
@Configuration
public class EventConfig implements WebMvcConfigurer {

	@Resource
	EventInterceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {	// ctrl+spacebar
		// TODO Auto-generated method stub
//		WebMvcConfigurer.super.addInterceptors(registry);
		
		// 인터셉터를 넣어라
		registry.addInterceptor(interceptor)
		// 추가하기
		.addPathPatterns("/event/gogo")
		// / 꼭 해야함 안그러면 계속 돌아요
		.addPathPatterns("/admin/**")
		// 제외하기
		.excludePathPatterns("/admin/ccc");
	}
}
