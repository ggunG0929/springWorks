package exer4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Exer4BeanPostProcessor implements BeanPostProcessor {
	// 생성시 interface BeanPostProcessor 추가함
	
	// ctrl+space	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		StudGrade ss = (StudGrade)bean;
//		if(ss.getName().startsWith("red")) {
		if((ss.getName().substring(0,3)).equals("red")) {
			ss.setGrade("가가가가가가양미우수수".charAt((int)(ss.avg/10))+""); 
		}else if(ss.getName().startsWith("blue")) {
			ss.setGrade("FFFFFFDCBAA".charAt((int)(ss.avg/10))+""); 
		}else if(ss.getName().startsWith("yello")) {
			ss.setGrade("55555543211".charAt((int)(ss.avg/10))+""); 
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
