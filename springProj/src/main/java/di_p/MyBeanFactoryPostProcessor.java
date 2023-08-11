package di_p;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// 생성시 인터페이스에서 bean factory post processor 추가함
		
		System.out.println(" MyBeanFactoryPostProcessor.postProcessBeanFactory() 실행");

	}

}
