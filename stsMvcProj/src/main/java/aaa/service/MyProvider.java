package aaa.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

// 클래스 생성시 인터페이스 applicationContextAware 설정하기
@Service
public class MyProvider implements ApplicationContextAware {

	ApplicationContext context;
	
	public ApplicationContext getContext() {
		return context;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;

	}

}
