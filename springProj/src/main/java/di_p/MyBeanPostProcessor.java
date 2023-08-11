package di_p;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	// 생성시 interface BeanPostProcessor 추가함
	
	// ctrl+space	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor.Beforeinit 실행:"+beanName+"=>"+bean);
		if(bean.getClass().getName().equals("di_p.Umbrella")) {
			System.out.println(bean+": 우산인가");
			Umbrella uu = (Umbrella)bean;
			if(uu.getPrice()>=5000) {
				uu.setType("비싸");
			}
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor.Afterinit 실행:"+beanName+"=>"+bean);
		if(bean.getClass().getName().equals("di_p.Coffee")) {
			System.out.println(bean+": After 커피인가");
			Coffee uu = (Coffee)bean;
			if(uu.getName().equals("아메리카노")) {
				uu.setType("건맨");
			}
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
