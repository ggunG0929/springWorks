package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowire_main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("anno_xml/Autowire.xml");
		
		// Error creating bean with name 'wm1': Unsatisfied dependency expressed through method 'setMt' parameter 0: No qualifying bean of type 'anno_p.Motor'
		// available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
		System.out.println(context.getBean("wm1"));
		System.out.println(context.getBean("rc1"));
		
		context.close();
	} 

}
