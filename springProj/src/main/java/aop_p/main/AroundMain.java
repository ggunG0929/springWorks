package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;

public class AroundMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("aop_xml/around.xml");
		
		JoSuk jsk = context.getBean("joSuk", JoSuk.class);

		System.out.println("jsk.dog1: "+jsk.dog1());
		System.out.println();
		System.out.println("jsk.wife: "+jsk.wife());
		System.out.println();
		System.out.println("jsk.papa: "+jsk.papa());
	}

}
