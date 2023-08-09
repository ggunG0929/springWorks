package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.HamburgerSet;

public class Hamburger_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/hamburger.xml");

		
		HamburgerSet hs1 = context.getBean("hs1",HamburgerSet.class);
		System.out.println(hs1);
		
	}

}