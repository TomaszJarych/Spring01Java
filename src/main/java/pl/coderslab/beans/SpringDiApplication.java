package pl.coderslab.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiApplication {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class)) {
			
			HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
			helloWorld.hello();
			
			Ship ship = context.getBean("blackPearl", Ship.class);
			ship.getCaptain().startSailing();

			
			Scope1 scope1 = context.getBean(Scope1.class);
			System.out.println(scope1);
			Scope1 scope11 = context.getBean(Scope1.class);
			System.out.println(scope11);
			Scope2 scope2 = context.getBean(Scope2.class);
			System.out.println(scope2);
			Scope2 scope22 = context.getBean(Scope2.class);
			System.out.println(scope22);
		}

	}
}
