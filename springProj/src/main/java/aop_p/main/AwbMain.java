package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class AwbMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/awb.xml");
		
		JoSuk jsk = context.getBean("joSuk",JoSuk.class);
		KangBada kbd = context.getBean("kbd",KangBada.class);
		KangSan kangSan = context.getBean("kangSan",KangSan.class);
		
		// retString: JoSuk.dog1(..)
		// paramInt:JoSuk.dog1(..)
		// nameDog: JoSuk.dog1(..)
		// ExecAdvice2 - oOrJo:JoSuk.dog1(..)
		// 센세이션은 찢찢 12, 아기상어
		// oOrJo: JoSuk.dog1(..)
		// jsk.dog1:센세이션
		System.out.println("jsk.dog1:"+jsk.dog1(12,"아기상어"));
		System.out.println("---------------");
		
		// retString: JoSuk.wife()
		// ExecAdvice2 - oOrJo:JoSuk.wife()
		// 애봉파워
		// oOrJo: JoSuk.wife()
		// jsk.wife:애봉
		System.out.println("jsk.wife:"+jsk.wife());
		System.out.println("---------------");
		
		// ExecAdvice2 - oOrJo:JoSuk.papa(..)
		// 조철왕:44
		// oOrJo: JoSuk.papa(..)
		// jsk.papa:4000
		System.out.println("jsk.papa:"+jsk.papa(44));
		System.out.println("---------------");
		
		// ExecAdvice2 - oOrJo:KangSan.ra9yo()
		// 독도에서 낚시해요
		// ExecAdvice2 - ok:KangBada.dogdo()
		// claKang: KangBada.dogdo()
		// endO: KangBada.dogdo()
		// oAndKang: KangBada.dogdo()
		// oOrJo: KangBada.dogdo()
		kbd.dogdo();
		System.out.println("---------------");
		
		// KangSan.연어()
		// claKang: KangSan.yunFish()
		kangSan.yunFish();
		System.out.println("---------------");
		// ExecAdvice2 - oOrJo:KangSan.ra9yo()
		// KangSan.라구요()
		// claKang: KangSan.ra9yo()
		// endO: KangSan.ra9yo()
		// oOrJo: KangSan.ra9yo()
		kangSan.ra9yo();
		System.out.println("---------------");
		
		/*
		 * 학생성적을 계산하세요
		 * 과목 2: 직장인학생
		 * 과목 3: 일반학생
		 * 과목 4: 예체능학생
		 * 
		 * aop를 이용하여 각 학생분류별 인원수와 평균의 합계, 평균의 평균을 구하세요
		 * */
	}

}