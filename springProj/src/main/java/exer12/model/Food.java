package exer12.model;

import org.springframework.stereotype.Component;

/*
 * 식당 주문을 구현하세요
 * 주문 종류에 따라 갯수를 구하세요
 * 종류
 * 	- 찌개, 덮밥
 * 
 * 가격이 10,000 미만인 경우 배달비를 추가하세요
 * 
 * 종류와 배달비 계산은 aop, annotation으로 처리
 * 
 * */

@Component
public class Food {
	String name;
	public String type;
	int cnt;

	public void food(String aa, int bb) {
		type = "덮밥";
		name = aa + type;
		cnt = bb;
		System.out.println(type+", "+name+", "+cnt);
	}

	public void food(String aa, String 공기밥, int bb) {
		type = "찌개";
		name = aa + type;
		cnt = bb;
	}

	@Override
	public String toString() {
		return "Food [type=" + type + ", name=" + name + ", cnt=" + cnt + "]";
	}

}