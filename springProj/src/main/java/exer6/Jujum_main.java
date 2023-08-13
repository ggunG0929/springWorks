package exer6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jujum_main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("anno_xml/exer6.xml");

		System.out.println(context.getBean("sp1"));
		System.out.println(context.getBean("sp2"));
		
		context.close();
	} 

}
