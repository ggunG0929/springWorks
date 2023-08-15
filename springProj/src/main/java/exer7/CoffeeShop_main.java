package exer7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeShop_main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("anno_xml/exer7.xml");

		System.out.println(context.getBean("americano"));
		System.out.println(context.getBean("cafelatte"));
		System.out.println(context.getBean("caramelmakiato"));
		
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(CoffeeShop.class);

        CoffeeShop cs = context2.getBean(CoffeeShop.class);
        cs.order();
        cs.sell();
		
		context.close();
	} 

}
