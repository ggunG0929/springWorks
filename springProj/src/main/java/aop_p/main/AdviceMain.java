package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class AdviceMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/advice.xml");
		
		JoSuk jsk = context.getBean("joSuk",JoSuk.class);

		// 	public String dog1(int aa, String bb) {
		// 		System.out.println("센세이션은 찢찢 "+aa+", "+bb);
		//		return "센세이션";

		// >>>beforeee: JoSuk.dog1(..)
		// 센세이션은 찢찢 12, 아기상어
		// >>>afterrr: JoSuk.dog1(..)
		// >>>returnnn: JoSuk.dog1(..)=> 센세이션
		// jsk.dog1: 센세이션
		System.out.println("jsk.dog1: "+jsk.dog1(12,"아기상어"));
		System.out.println("---------------");
		
		// >>>beforeee: JoSuk.nums(..)
		// nums:2
		// >>>afterrr: JoSuk.nums(..)
		// >>>returnnn: JoSuk.nums(..)=> 50
		jsk.nums(2);
		System.out.println("---------------");
		
		// >>>beforeee: JoSuk.nums(..)
		// nums:0
		// >>>afterrr: JoSuk.nums(..)
		// >>>errrr: JoSuk.nums(..)=>/ by zero
		jsk.nums(0);
		System.out.println("---------------");
		
	}
}