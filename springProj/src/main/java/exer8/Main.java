package exer8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(OutfitPackageConfig.class);

        // 패키지로 연결
        System.out.println(context.getBean("of1"));
        System.out.println();
        System.out.println(context.getBean("of3"));
        
        System.out.println();
        context.close();        
        context = new AnnotationConfigApplicationContext(OutfitXmlConfig.class);
        
        // xml로 연결
        System.out.println(context.getBean("of2"));
        System.out.println();
        System.out.println(context.getBean("of4"));
        
        context.close();
	}

}
