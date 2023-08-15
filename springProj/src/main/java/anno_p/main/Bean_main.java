package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean_main {
	
	public static void main(String[] args) {
	
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("anno_xml/bean.xml");
		
		// autowire가 더 우선
		// Mouse [name=HP920, type=버티컬]
		System.out.println(context.getBean("hp920"));
		
		// Error creating bean with name 'gm1': Unsatisfied dependency expressed through field 'bc':
		// No qualifying bean of type 'anno_p.com.Bonche' available: expected at least 1 bean which qualifies as autowire candidate.
		// Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
		// NoteBook [bc=Bonche [name=아수스, cpu=1.77GHz], mouse=Mouse [name=매직마우스, type=블루투스], name=삼보그램]
		System.out.println(context.getBean("gm1"));

		// No bean named 'gm2' available
//		System.out.println(context.getBean("gm2"));
		// NoteBook [bc=Bonche [name=아수스, cpu=1.77GHz], mouse=Mouse [name=매직마우스, type=블루투스], name=기가바이트]
		System.out.println(context.getBean("nb"));
		
		// WorkStation [name=델1, bon=null, m1=null, m2=null, mm=Mouse [name=HP920, type=버티컬]]
		System.out.println(context.getBean("ws1"));
		// WorkStation [name=델2, bon=Bonche [name=엘지, cpu=1.66GHz], m1=null, m2=null, mm=Mouse [name=HP920, type=버티컬]]
		System.out.println(context.getBean("ws2"));
		
		// notebook
		// bonche는 xml파일에
		// autowired setBc-xml에서 name=bc
		// mouse는 resource
		
		// workstation
		// 	@Bean
		// WorkStation ws1() {return new WorkStation("델1", null, null, null, hp920());}
		//	@Bean
		// WorkStation ws2(Bonche LG, Mouse hp920) {return new WorkStation("델2", LG, null, null, hp920);}
		context.close();
	} 

}
