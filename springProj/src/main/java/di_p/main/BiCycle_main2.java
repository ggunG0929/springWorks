package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.InterBiCycle;

public class BiCycle_main2 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/bicycle2.xml");
		
//	<bean class="di_p.Wheel" name="w1">
//		<property name="name" value="작은바퀴"/>
//		<property name="size" value="22"/>
//	</bean>
//	<bean class="di_p.Wheel" name="w2">
//		<property name="name" value="큰바퀴1"/>
//		<property name="size" value="24"/>
//	</bean>
//	<bean class="di_p.Wheel" name="w3">
//		<property name="name" value="큰바퀴2"/>
//		<property name="size" value="24"/>
//	</bean>
//	
//	<bean class="di_p.Handle" name="h1">
//		<property name="name" value="일반핸들"/>
//		<property name="type" value="일자"/>
//	</bean>
//	<bean class="di_p.Handle" name="h2">
//		<property name="name" value="이반핸들"/>
//		<property name="type" value="y자"/>
//	</bean>
//	
//	<bean class="di_p.Basket" name="bb">
//		<property name="name" value="앞바구니"/>
//		<property name="kind" value="빵적재"/>
//	</bean>
//	
//	<bean class="di_p.InThree" name="bc1">
//		<property name="name" value="삼천리"/>
//		<property name="wh1" ref="w1"/>
//		<property name="wh2" ref="w2"/>
//		<property name="wh3" ref="w3"/>
//		<property name="hd" ref="h1"/>
//	</bean>
//	
//	<bean class="di_p.InPocari" name="bc2">
//		<property name="name" value="샤라라라라라"/>
//		<property name="wh2" ref="w2"/>
//		<property name="wh3" ref="w3"/>
//		<property name="bk" ref="bb"/>
//		<property name="hd" ref="h2"/>
//	</bean>
//	
//	<bean class="di_p.InMTB" name="bc3">
//		<property name="name" value="산을"/>
//		<property name="wh1" ref="w1"/>
//		<property name="wh2" ref="w2"/>
//		<property name="hd" ref="h1"/>
//	</bean>
		
		for (String str : "bc1,bc2,bc3".split(",")) {
			InterBiCycle bc = context.getBean(str,InterBiCycle.class);
			System.out.println(bc);
		}
	}
}
