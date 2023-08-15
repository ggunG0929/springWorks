package exer8;

import org.springframework.context.annotation.Bean;

import exer8.closet.Accessory;
import exer8.closet.Clothes;
import exer8.closet.Hat;
import exer8.closet.Outfit;
import exer8.closet.Shoes;

// @ImportResource("anno_xml/exer8.xml")를 분리하지 않으면 오류
// Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException: 
// Error creating bean with name 'of1' defined in exer8.OutfitPackageConfig: 
// Unsatisfied dependency expressed through method 'of1' parameter 0: 
// No qualifying bean of type 'exer8.closet.Hat' available: 
// expected single matching bean but found 2: h1,h2		//of1이 xml에 정의한 bean을 연결하려고 함

// 같은 클래스는 아니지만 굳이 component scan 쓰지 않아도 잘 돌아감
public class OutfitPackageConfig {
	@Bean
	Hat sh1() {
		return new Hat("낚시모자");
	}
	@Bean
	Hat sh2() {
		return new Hat("중절모");
	}
	@Bean
	Clothes sc1() {
		return new Clothes("등산복");
	}
	@Bean
	Clothes sc2() {
		return new Clothes("정장");
	}
	@Bean
	Accessory sa() {
		// 산과 결혼식장 중복 사용
		return new Accessory("지팡이");
	}
	@Bean
	Shoes ss1() {
		return new Shoes("트레킹화");
	}
	@Bean
	Shoes ss2() {
		return new Shoes("구두");
	}
	@Bean
	Outfit of1(Hat sh1, Clothes sc1,  Accessory sa, Shoes ss1) {
		return new Outfit("산", sh1, sc1, sa, ss1);
	}
	@Bean
	Outfit of3(Hat sh2, Clothes sc2,  Accessory sa, Shoes ss2) {
		return new Outfit("결혼식장", sh2, sc2, sa, ss2);
	}

}