package aaa.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import aaa.model.Battery;
// 클래스를 빈으로 만들어 줌 컴퍼넌트도 되는 듯? 어디서든 빈을 불러와서 쓸 수 있어서 편함 거의 프로바이더랑 세트로 보면 되는 듯?
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

}
