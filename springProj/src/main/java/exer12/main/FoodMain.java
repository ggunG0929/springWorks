package exer12.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exer12.Order;
import exer12.model.Food;

public class FoodMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/exer12.xml");
		Food f = context.getBean("food", Food.class);
        Order o = context.getBean("order", Order.class);

//		f.food("불고기덮밥", 2);
//		f.food("김치찌개", "공기밥", 2);
		
		o.order((f.food("불고기덮밥", 1), f.food("김치찌개", "공기밥", 2)));
		System.out.println("---------------");

		context.close();
		
	}
}