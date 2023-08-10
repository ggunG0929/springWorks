package exer3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MealShopMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/exer3.xml", "di_xml/exer3part.xml");
		
		MealShop ms = context.getBean("ms", MealShop.class);
		
		System.out.println("아침: " + ms.order_morning());
		System.out.println("점심: " + ms.order_lunch());
		System.out.println("저녁: " + ms.order_dinner());

	}

}
