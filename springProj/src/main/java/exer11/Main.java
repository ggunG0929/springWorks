package exer11;

import java.util.Random;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/exer11.xml");
		
		Student std = context.getBean("student",Student.class);
		
		Random r = new Random();
		
		for(int i=0; i<10; i++) {
			System.out.println(std.st1(r.nextInt(0,100), r.nextInt(0,100)));
			System.out.println(std.st1(r.nextInt(0,100), r.nextInt(0,100), r.nextInt(0,100)));
			System.out.println(std.st1(r.nextInt(0,100), r.nextInt(0,100), r.nextInt(0,100), r.nextInt(0,100)));
		}
		
	}
}
