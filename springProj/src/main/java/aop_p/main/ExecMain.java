package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class ExecMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/exec.xml");
		
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
		
		System.out.println("---------------");
		

		
		
	}

}