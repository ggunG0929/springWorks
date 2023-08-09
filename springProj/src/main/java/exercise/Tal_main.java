package exercise;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tal_main {

	public static void main(String[] args) {
		// xml 안에서는 순서가 상관없음 후에 변수를 선언해도 이상없음
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/exercise.xml");		
		
		Bike bk1 = (Bike)context.getBean("bk1");
		Bike bk2 = (Bike)context.getBean("bk2");
		Bike bk3 = (Bike)context.getBean("bk3");
		bk1.go();
		bk2.fix();
		bk3.fall();
		System.out.println(bk1);
		System.out.println(bk2);
		System.out.println(bk3);
		
		/* Bike0 bk4 = (Bike0)context.getBean(bk1); */
	}

}
