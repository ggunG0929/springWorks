package exer12.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exer12.model.Food;

public class FoodMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/exer12.xml");
		
		Food f = context.getBean("food",Food.class);

		// 	public String dog1(int aa, String bb) {
		// 		System.out.println("센세이션은 찢찢 "+aa+", "+bb);
		//		return "센세이션";

		f.food("불고기", 2);
		System.out.println("---------------");

		System.out.println("---------------");

		System.out.println("---------------");
		
	}
}