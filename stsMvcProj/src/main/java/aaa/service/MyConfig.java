package aaa.service;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import aaa.model.Battery;
import aaa.model.SeasonMain;
// 클래스를 빈으로 만들어 줌 컴퍼넌트도 되는 듯? 어디서든 빈을 불러와서 쓸 수 있어서 편함 거의 프로바이더랑 세트로 보면 되는 듯?
// 빈설정을 가지고 있다고 알려주는 어노테이션
// 다른 클래스에서는 빈을 autowire를 통해 주입받을 수 있음
@Configuration
public class MyConfig {
	
	@Bean
	Battery bat1() {
		return new Battery("로케트밧데리", 500);
	}
	
	@Bean
	Battery bat2() {
		return new Battery("사랑의밧데리", 300);
	}
	
	// season2 - 이미 시즌메인에서 component로 빈으로 등록된 상태임
//    @Bean
//    public SeasonMain seasonMain() {
//        return new SeasonMain();
//    }

	
//    @Bean(name = "springPictures")
//    List<String> springPictures() {
//        return List.of("sp1.jpg", "sp2.jpg", "sp3.jpg");
//    }
//    @Bean(name = "summerPictures")
//    List<String> summerPictures() {
//        return List.of("sua.jpg", "sub.jpg");
//    }
//    @Bean(name = "autumnPictures")
//    List<String> autumnPictures() {
//        return List.of("at_1.jpg", "at_2.jpg", "at_5.png", "at_6.jpg");
//    }
//    @Bean(name = "winterPictures")
//    List<String> winterPictures() {
//        return List.of("ww.jpg", "ee.jpg", "sp1.jpg");
//    }
    
}
