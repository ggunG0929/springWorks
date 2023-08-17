package exer11;

import org.springframework.stereotype.Component;

/*
 * 학생성적을 계산하세요
 * 과목 2: 직장인학생
 * 과목 3: 일반학생
 * 과목 4: 예체능학생
 * 
 * aop를 이용하여 각 학생분류별 인원수와 평균의 합계, 평균의 평균을 구하세요
 * */

@Component
public class Student {

	public String st1(int aa, int bb) {
		return "내 점수는 "+aa+", "+bb+"야";
	}

	public String st1(int aa, int bb, int cc) {
		return "내 점수는 "+aa+", "+bb+", "+cc+"야";
	}
	
	public String st1(int aa, int bb, int cc, int dd) {
		return "내 점수는 "+aa+", "+bb+", "+cc+", "+dd+"야";
	}

}
