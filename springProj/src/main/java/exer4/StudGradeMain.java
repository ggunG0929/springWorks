package exer4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudGradeMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/exer4.xml");
		
		System.out.println(context.getBean("st1"));
		System.out.println(context.getBean("st2"));
		System.out.println(context.getBean("st3"));
		System.out.println(context.getBean("st4"));
		System.out.println(context.getBean("st5"));
		System.out.println(context.getBean("st6"));
		
	}

}
