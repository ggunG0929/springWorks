package exer2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exer2.SRank;
import exer2.Student;

public class SRankMain {

	public static void main(String[] args) {

			
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/srank.xml");

//		Student st1 = (Student)context.getBean("st1");
//		Student st1 = context.getBean("st1", Student.class);
//		System.out.println(st1);
		
//		Student st2 = context.getBean("st2", Student.class);
//		st2.calc();
//		Student st3 = context.getBean("st3", Student.class);
//		st3.calc();
//		Student st4 = context.getBean("st4", Student.class);
//		st4.calc();
//		System.out.println(st3.avg);
//		SRank sr1 = context.getBean("sr1", SRank.class);
		
		SRank sr1 = context.getBean("sr1", SRank.class);
			System.out.println(sr1);
			
//		for(Student st : sr1) {
//			System.out.println(st);
//		}
	}
}
