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
	int cnt;

	public void setName(String name) {
		this.name = name;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public Food food(String aa, int bb) {
		Food food = new Food();
		food.setName(aa);
		food.setCnt(bb);
		System.out.println(food.name+", "+food.cnt);
		return food;
	}

	public Food food(String aa, String cc, int bb) {
		Food food = new Food();
		food.setName(aa+"와 "+cc);
		food.setCnt(bb);
		System.out.println(food.name+", "+food.cnt);
		return food;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", cnt=" + cnt + "]";
	}

}