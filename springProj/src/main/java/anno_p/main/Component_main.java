package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Component_main {
	
	public static void main(String[] args) {
	
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("anno_xml/component.xml");
		
		// xml에서 적어주고 클래스에서 어노테이션걸어주기
		// bean으로 등록하지 않았어도 component를 통해서 호출이 됨
		// Mouse [name=매직마우스, type=블루투스]
		System.out.println("mouse: " + context.getBean("mouse"));
		
		// 클래스명에서 첫글자를 소문자로 바꾼 이름으로 빈이 만들어짐

		// 노트북클래스의 mouse 필드에 resource를 걸어주면 연결됨(그전에는 null)
		// NoteBook [bc=null, mouse=Mouse [name=매직마우스, type=블루투스], name=삼보그램]
		
		// 노트북 클래스의 bonche필드에 autowired 어노테이션
		// Error creating bean with name 'noteBook': Unsatisfied dependency expressed through field 'bc':
		// No qualifying bean of type 'anno_p.com.Bonche' available: expected at least 1 bean which qualifies as autowire candidate.
		// Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
		// Bonche클래스에 component 걸어주어야 연결됨
		
		// notebook클래스를 comabc폴더로 옮기면 오류
		// No bean named 'noteBook' available
		// xml에서 <context:component-scan base-package="anno_p.comabc"/> 추가
		System.out.println("noteBook: " + context.getBean("noteBook"));
		
		// No bean named 'bbcc' available
		// @Component("bbcc") 부여 가능
		System.out.println("bbcc: " + context.getBean("bbcc"));

		// 클래스 이름을 대문자 여러개 붙여서 지정했다면 같이 대문자로 써줘야 함
		// No bean named 'dESKTop', 'deskTop' available
		// 모니터 상속한 Mnntt클래스 생성으로 오류 생김
		// Error creating bean with name 'DESKTop': Injection of resource dependencies failed
		// resource(name="mnntt")로 지정해주면 됨
//		System.out.println("dESKTop: " + context.getBean("dESKTop"));
//		System.out.println("deskTop: " + context.getBean("deskTop"));
		System.out.println("DESKTop: " + context.getBean("DESKTop"));
				
		context.close();
	} 

}
