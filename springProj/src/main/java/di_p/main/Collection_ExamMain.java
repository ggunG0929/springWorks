package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Exam;
import di_p.Stud;

public class Collection_ExamMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/coll_exam.xml");
		
//		<bean class="di_p.Stud" name="st1">
//			<property name="name" value="한가인"/>
//			<property name="jum" value="77,78,72"/>
//		</bean>
//		
//		<bean class="di_p.Stud" name="st2">
//			<property name="name" value="두가인"/>
//			<property name="jum" value="57,58,52"/>
//		</bean>
//		
//		<bean class="di_p.Stud" name="st3">
//			<property name="name" value="삼가인"/>
//			<property name="jum" value="97,98,92"/>
//		</bean>
//		
//		<bean class="di_p.Stud" name="st4">
//			<property name="name" value="사가인"/>
//			<property name="jum" value="87,78,62"/>
//		</bean>
//		
//		<bean class="di_p.Stud" name="st5">
//			<property name="name" value="오가인"/>
//			<property name="jum" value="87,88,82"/>
//		</bean>
//		
//		<bean class="di_p.Exam" name="exam">
//			<property name="studs" >
//				<list>
//					<ref bean="st1" />
//					<ref bean="st2" />
//					<ref bean="st3" />
//					<ref bean="st4" />
//					<ref bean="st5" />
//				</list>
//			</property>
//		</bean>

		for (Stud st: context.getBean("exam", Exam.class).getSet()) {
			System.out.println(st);
		}
		
	}

}
