package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWire_main {

	public static void main(String[] args) {
		// xml 여러개 가져와서 써도 됨!
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/autowire.xml", "di_xml/autoparts.xml");
		
		// <bean class="di_p.AutoCar" name="car1" p:name="소나타" p:handle-ref="hhdd1">
		// 엔진은 수동으로 property 지정, handle 지정
		// car1: AutoCar [name=소나타, eng=AutoEngine [name=병렬4기통, power=400], whs=null, handle=AutoHandle [name=핸들1, type=승용차용]]
		System.out.println("car1: " + context.getBean("car1"));
		
		// autowire bytype 자동으로 연결
		// 리스트 항목은 여러개 모두 가져옴(wheel)
		// 타입이 두가지인 경우 : Error creating bean with name 'car2' defined in class path resource 
		// [di_xml/autowire.xml]: Unsatisfied dependency expressed through bean property 'handle': No qualifying bean of type 'di_p.AutoHandle' available
		// : expected single matching bean but found 2: hhdd1,hhdd2 (핸들은 둘 중에 지정해줌)
		// <bean class="di_p.AutoCar" name="car2" autowire="byType" p:name="말도타" p:handle-ref="hhdd1"/>로 handle을 지정해주면 해결됨
		// car2: AutoCar [name=말도타, eng=AutoEngine [name=V4기통, power=500], whs=[AutoWheel [name=크롬휠, size=21], AutoWheel [name=고무휠, size=21], AutoWheel [name=자전거휠, size=21], AutoWheel [name=탱크휠, size=21]], handle=AutoHandle [name=핸들1, type=승용차용]]
		System.out.println("car2: " + context.getBean("car2"));

		// handle의 이름을 handle로 해서 handle만 가지고옴
		// setter로 연결한 wheel 1,3번을 가져옴
		// eng null handle
		// car3: AutoCar [name=개만타, eng=null, whs=[AutoWheel [name=크롬휠, size=21], AutoWheel [name=자전거휠, size=21]], handle=AutoHandle [name=핸들2, type=경주용]]
		System.out.println("car3: " + context.getBean("car3"));
		
		// constructor
		System.out.println("car4: " + context.getBean("car4"));

	}

}
