package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.CoffeeShop;
import di_p.Coffee;

public class Lookup_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/lookup.xml");
		
		CoffeeShop cs = context.getBean("cs", CoffeeShop.class);
		
		// lookup 메소드 연결 전 - 메소드의 print 문구까지 나옴
		// order_am 실행
		// order_am: Coffee [name=아메리카노, price=1400]
		
		// lookup 메소드 연결 - 리턴값만 가져옴
		// order_am: Coffee [name=아시아노, price=1600]
		System.out.println("order_am: " + cs.order_am());

		// 쓸려면 coffee가 public이 되어야 하니까 분리해줌 왜냐면 public class는 자바 파일당 1개만 쓸 수 있으니까
//		Coffee co = (Coffee)context.getBean("co", Coffee.class);
//		System.out.println("co: " + co);

		// void는 리턴형이 아니라서 오류
//		System.out.println("order_void: " + cs.order_void());
		// <lookup-method name="order_void" bean="co"/>가 적용되면 실행되지 않음(오류는 없지만 아무것도 호출되지 않음)
		cs.order_void();
		
		// 리턴 자료형이 맞지 않아서 오류(Coffee가 아닌 Tea)
		// <lookup-method name="order_tea" bean="co"/>했을시 class di_p.Coffee cannot be cast to class di_p.Tea
//		System.out.println("order_tea: " + cs.order_tea());
		
		// private는 접근불가 적용안됨 의미없음
		// The method order_private() from the type CoffeeShop is not visible
//		System.out.println("order_private: " + cs.order_private());
		// 원래 내용 출력
		System.out.println("order_private2: " + cs.order_private2());
		
		// final: 오류는 나지 않지만 xml 값이 나오지 않음(적용안됨)
		System.out.println("order_final: " + cs.order_final());

		// static: 오류는 나지 않지만 xml 값이 나오지 않음(적용안됨)
		System.out.println("order_static: " + cs.order_static());
		
		// lookup 연결잘됨: order_piano: Coffee [name=아시아노, price=1600]
		System.out.println("order_piano: " + cs.order_piano());
		
		// abstract: 연결잘됨 오히려 추상메서드는 재정의로 실행
		System.out.println("order_hunter: " + cs.order_hunter());
		// 그냥 추상메서드
		// Receiver class di_p.CoffeeShop$$SpringCGLIB$$0 does not define or inherit an implementation of the resolved method 'abstract di_p.Coffee order_latte()' of abstract class 
//		System.out.println("order_latte: " + cs.order_latte());
		
	}

}
