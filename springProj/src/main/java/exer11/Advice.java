package exer11;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Advice {
	int sum1=0, sum2=0, sum3=0;
	int cnt1, cnt2, cnt3;
	String type;
	void jigjang(JoinPoint joinPoint, int aa, int bb) {
		sum1 += (int)((aa+bb)/2);
		cnt1++;
		double avg = sum1/cnt1;
		type="직장인";
		System.out.println(type + "이시네요. 현재 인원수는 "+cnt1+", 평균값의 합은 "+sum1+", 평균값의 평균은 "+avg+" 입니다.");
	}
	void normal(JoinPoint joinPoint, int aa, int bb, int cc) {
		sum2 += (int)((aa+bb+cc)/3);
		cnt2++;
		double avg = sum2/cnt2;
		type="일반인";
		System.out.println(type + "이시네요. 현재 인원수는 "+cnt2+", 평균값의 합은 "+sum2+", 평균값의 평균은 "+avg+" 입니다.");
	}
	void art(JoinPoint joinPoint, int aa, int bb, int cc, int dd) {
		sum3 += (int)((aa+bb+cc+dd)/4);
		cnt3++;
		double avg = sum3/cnt1;
		type="예체능인";
		System.out.println(type + "이시네요. 현재 인원수는 "+cnt3+", 평균값의 합은 "+sum3+", 평균값의 평균은 "+avg+" 입니다.");
	}
}
