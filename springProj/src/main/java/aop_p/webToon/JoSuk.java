package aop_p.webToon;

import org.springframework.stereotype.Component;

// 빈등록
@Component
public class JoSuk {

//	public String dog1() {
//		System.out.println("센세이션은 찢찢");
//		return "센세이션";
//	}
	// 매개변수 추가
	public String dog1(int aa, String bb) {
		System.out.println("센세이션은 찢찢 "+aa+", "+bb);
		return "센세이션";
	}
	
	public String wife() {
		System.out.println("애봉파워");
		return "애봉";
	}
	
	// 얘는 int라서 arTest가 안걸리는건가? 맞음 걸어준 거에 조건이 String
	
//	public int papa() {
//		System.out.println("조철왕");
//		return 4000;
//	}
	// 매개변수 추가
	public int papa(int c) {
		System.out.println("조철왕:"+c);
		return 4000;
	}
	
	public int nums(int c) {
		System.out.println("nums:"+ c);
		return 100/c;
	}

}