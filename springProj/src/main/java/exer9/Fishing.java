package exer9;

import java.util.Random;

import org.springframework.stereotype.Component;

// 빈등록
@Component
public class Fishing {

/*
낚시를 구현하세요

미끼를 넣지 않고 낚시할 경우 : 미끼를 넣으세요 메세지 호출 후 자동 종료 - 매개변수가 없으면 method호출 x
낚시한 물고기가 20cm 이하인 경우 : 풀어주자 메세지 호출 및 리턴 물고기 null 로 변경

*/
	public String fish(String aa) {
		Random r = new Random();
		int size = r.nextInt(10,30);
//		int size = 15;
//		int size = 25;
		System.out.println("미끼는 "+aa+", 낚시를 하고 있습니다.");
		System.out.println(size+"cm 물고기가 잡혔다!");
		return size+"cm 물고기 1개";
	}
	public String fish() {
//		System.out.println("미끼를 넣으세요");
//		return null;
		return "낚시를 하려면 미끼를 넣어주세요";
	}
	
	// 정현씨방법
//	public String fish(String aa, int bb) {
//		Random r = new Random();
//		bb = r.nextInt(10,30);
////		int size = 15;
////		int size = 25;
//		System.out.println("미끼는 "+aa+", 낚시를 하고 있습니다.");
//		System.out.println(bb+"cm 물고기가 잡혔다!");
//		return "물고기";
//	}
}
