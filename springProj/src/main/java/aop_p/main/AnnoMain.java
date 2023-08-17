package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class AnnoMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/anno.xml");
		
		JoSuk jsk = context.getBean("joSuk",JoSuk.class);

		// 	public String dog1(int aa, String bb) {
		// 		System.out.println("센세이션은 찢찢 "+aa+", "+bb);
		//		return "센세이션";

		System.out.println("jsk.dog1: "+jsk.dog1(12,"아기상어"));
		System.out.println("---------------");
		jsk.nums(2);
		System.out.println("---------------");
		jsk.nums(0);
		System.out.println("---------------");
		
	}
}