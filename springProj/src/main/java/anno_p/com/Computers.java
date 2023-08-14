package anno_p.com;
// anno_p -> anno_p.com
// 처음에는 오류나다가 @configuration, xml에 component-scan 넣어서 오류없앰
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import anno_p.com.sub1.Mouse;
import anno_p.comabc.NoteBook;

@Configuration
public class Computers {
	
	@Bean
	Mouse hp920() {
		return new Mouse("HP920", "버티컬");
	}
	
	@Bean
	NoteBook gm1() {
		return new NoteBook();
	}
	
	@Bean(name="nb")
	NoteBook gm2(Bonche LG) {
		NoteBook res = new NoteBook();
		res.setName("기가바이트");
		res.setBc(LG);
		return res;
	}
	
	@Bean
	WorkStation ws1() {
		// 같은 메서드 내의 호출은 가능하지만(annotation bean) 그 외에는 불가
//		return new WorkStation("델1", asus(), null, null, hp920());
		return new WorkStation("델1", null, null, null, hp920());
	}
	
	@Bean
	WorkStation ws2(Bonche LG, Mouse hp920) {		// 매개변수로 bean 호출
		return new WorkStation("델2", LG, null, null, hp920);
	}

}
