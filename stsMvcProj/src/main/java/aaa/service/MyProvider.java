package aaa.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

// 서비스 어노테이션 - 이미 빈으로 등록됨
@Service
// 클래스 생성시 인터페이스 applicationContextAware 설정하기
// 스프링인터페이스에 접근가능
public class MyProvider implements ApplicationContextAware {

	ApplicationContext context;
	
	public ApplicationContext getContext() {
		return context;
	}

//	private Map<String, Object> dataMap = new HashMap<>();

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
		
//		dataMap.put("spring", context.getBean("springPictures"));
//		dataMap.put("summer", context.getBean("summerPictures"));
//		dataMap.put("autumn", context.getBean("autumnPictures"));
//		dataMap.put("winter", context.getBean("winterPictures"));
		
	}

//    public Object getData(String season) {
//        return dataMap.get(season);
//    }

}
