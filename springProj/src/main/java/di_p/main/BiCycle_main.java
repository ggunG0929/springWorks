package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.BiCycle;

public class BiCycle_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/bicycle.xml");

//	<bean class="di_p.Wheel" name="w1">
//		<property name="name" value="작은바퀴"/>
//		<property name="size" value="22"/>
//	</bean>
//	
//	<bean class="di_p.Wheel" name="w2">
//		<property name="name" value="큰바퀴1"/>
//		<property name="size" value="24"/>
//	</bean>
//	
//	<bean class="di_p.Wheel" name="w3">
//		<property name="name" value="큰바퀴2"/>
//		<property name="size" value="24"/>
//	</bean>
//	
//	
//	<bean class="di_p.Handle" name="h1">
//		<property name="name" value="일반핸들"/>
//		<property name="type" value="일자"/>
//	</bean>
//	
//	<bean class="di_p.Handle" name="h2">
//		<property name="name" value="이반핸들"/>
//		<property name="type" value="y자"/>
//	</bean>
//	
//	
//	<bean class="di_p.Basket" name="bb">
//		<property name="name" value="앞바구니"/>
//		<property name="kind" value="빵적재"/>
//	</bean>
//	
//	
//	<bean class="di_p.BiCycle" name="bc1">
//		<property name="name" value="세발자전거"/>
//		<property name="wh1" ref="w1"/>
//		<property name="wh2" ref="w2"/>
//		<property name="wh3" ref="w3"/>
//		<property name="hd" ref="h1"/>
//	</bean>
		
		// xml연결
		// BiCycle [name=세발자전거, hd=Handle [name=일반핸들, type=일자], bk=null, 
		//	wh1=Wheel [name=작은바퀴, size=22], wh2=Wheel [name=큰바퀴1, size=24], wh3=Wheel [name=큰바퀴2, size=24]]
		// BiCycle [name=포카리자전거, hd=Handle [name=이반핸들, type=y자], bk=Basket [name=앞바구니, kind=빵적재], 
		//	wh1=null, wh2=Wheel [name=큰바퀴1, size=24], wh3=Wheel [name=큰바퀴2, size=24]]
		// BiCycle [name=MTB, hd=Handle [name=일반핸들, type=일자], bk=null, 
		//	wh1=Wheel [name=작은바퀴, size=22], wh2=Wheel [name=큰바퀴1, size=24], wh3=null]
		for (String str : "bc1,bc2,bc3".split(",")) {
//			BiCycle bc = (BiCycle)context.getBean(str);
			BiCycle bc = context.getBean(str,BiCycle.class);
			System.out.println(bc);
		}

	}

}
