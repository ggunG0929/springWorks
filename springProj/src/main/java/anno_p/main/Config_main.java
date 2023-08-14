package anno_p.main;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import anno_p.AnnoConfig;

public class Config_main {
	
	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnoConfig.class);

		// 정의된 bean
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		// BiCycle [name=삼천리, hd=BiHandle [name=일자핸들, type=산악용], wh=BiWheel [name=디스크, size=28]]
		System.out.println(context.getBean("mtb"));
		// BiCycle [name=화려강산, hd=BiHandle [name=3자핸들, type=오인용], wh=BiWheel [name=카본, size=27]]
		System.out.println(context.getBean("pb"));
		// @ComponentScan(basePackages = "anno_p.com")로 가져옴
		// NoteBook [bc=Bonche [name=삼보트라이젠, cpu=1.33Ghz], mouse=Mouse [name=매직마우스, type=블루투스], name=기가바이트]
		System.out.println(context.getBean("nb"));
		// @importResource로 가져옴
		// RCCar [name=아스라다, mtr=Motor [name=블랙라벨, power=100], rw1=RCWheel [name=스노우, size=20], rw2=null, rw3=null, rw4=null]
		System.out.println(context.getBean("rc1"));

	} 

}
