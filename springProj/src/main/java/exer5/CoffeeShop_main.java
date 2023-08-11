package exer5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeShop_main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("anno_xml/exer5.xml");

		System.out.println(context.getBean("cc1"));
		
		context.close();
	} 

}
