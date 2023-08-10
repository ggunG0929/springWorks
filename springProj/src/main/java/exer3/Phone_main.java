package exer3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/phone.xml");
		
		System.out.println("어른폰: " + context.getBean("ap"));
		System.out.println("은하수폰: " + context.getBean("mp"));

	}

}
