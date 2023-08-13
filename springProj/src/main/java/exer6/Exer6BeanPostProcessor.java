package exer6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// 생성시 interface BeanPostProcessor 추가함
public class Exer6BeanPostProcessor implements BeanPostProcessor {
	
	// ctrl+space	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// 클래스가 주점일 때만
		if(bean.getClass().getName().equals("exer6.Jujum")) {
			Jujum jj = (Jujum)bean;
			// 세트 이름 만들기(안주메뉴 첫글자+술메뉴 첫글자)
			jj.setName(jj.getAnju().getMenu().substring(0,1) + jj.getAlc().getName().substring(0,1) + "세트");
			// 세트 가격 연산(서비스를 주니까 가격은 단순합으로)
			jj.setPrice(jj.getAnju().getPrice() + jj.getAlc().getPrice());
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
