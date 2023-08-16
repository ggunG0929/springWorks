package exer9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;

public class AroundMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/exer9.xml");
		
		Fishing f = context.getBean("fishing",Fishing.class);
		
		System.out.println(f.fish());
		System.out.println();
		System.out.println(f.fish("정어리"));
		
//		System.out.println(f.fish("미끼", 20));
	}

}
