package exer7_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeShop_main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("anno_xml/exer7_1.xml", "anno_xml/exer7.xml");

		System.out.println(context.getBean("bean"));
		System.out.println(context.getBean("water"));
		System.out.println(context.getBean("caramel"));
		System.out.println(context.getBean("milk"));
		System.out.println(context.getBean("americano"));
		System.out.println(context.getBean("cafelatte"));
		System.out.println(context.getBean("caramelmakiato"));
		
		context.close();
	} 

}
